package parcial_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 * 
 */

import java.util.ArrayList ;
    import java.util.List ;

public class Usuario {
   private int id;
    private String name;
    private List<Libro> libros;

    public Usuario(int id, String name) {
        this.id = id;
        this.name = name;
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void mostrarLibros() {
        System.out.println("Usted tiene los siguientes libros, " + this.name + ":");
        for (Libro p : libros) {
            System.out.println(p); 
        }
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}     