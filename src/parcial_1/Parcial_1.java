/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_1;

/**
 *
 * @author estudiante
 */

import java.util.ArrayList ;
    import java.util.List ;
import java.util.Scanner;
public class Parcial_1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Usuario> usuarios = new ArrayList<>();
            List<Libro> libros = new ArrayList<>();
            
            System.out.println("Bienvenido a la biblioteca universitaria");
            
            
            boolean seguirRegistrandoUsuarios = true;
            while (seguirRegistrandoUsuarios) {
                System.out.print("Ingrese el ID del nuevo usuario: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Ingrese el nombre del nuevo usuario: ");
                String nombreUsuario = scanner.nextLine();
                
                Usuario nuevoUsuario = new Usuario(id, nombreUsuario);
                usuarios.add(nuevoUsuario);
                
                System.out.print("¿Desea registrar otro usuario? (sí/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    seguirRegistrandoUsuarios = false;
                }
            }
            
            boolean seguirRegistrandoLibros = true;
            while (seguirRegistrandoLibros) {
                System.out.print("Ingrese el nombre del libro: ");
                String nombreLibro = scanner.nextLine();
                System.out.print("Ingrese la categoría del libro (Cocina, Filosofía, Ciencia, Novela): ");
                String categoriaLibro = scanner.nextLine();
                System.out.print("Ingrese el autor del libro: ");
                String autorLibro = scanner.nextLine();
                
                Libro nuevoLibro = new Libro(nombreLibro, categoriaLibro, autorLibro);
                libros.add(nuevoLibro);
                
                System.out.print("¿Desea registrar otro libro? (sí/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    seguirRegistrandoLibros = false;
                }
            }
            
            for (Usuario usuario : usuarios) {
                System.out.println("\nBienvenido " + usuario.getName() + " a la biblioteca.");
                for (Libro libro : libros) {
                    System.out.println("¿Desea agregar el libro: " + libro.getName() + "? (sí/no)");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("sí")) {
                        usuario.agregarLibro(libro);
                    }
                }
            }
            
            for (Usuario usuario : usuarios) {
                usuario.mostrarLibros();
            }
        }
    }
}
