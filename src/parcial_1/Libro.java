package parcial_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Libro {
    String name;
    String categoria;
    static int numLibro;
    String autor;

    public Libro(String name, String categoria, String autor) {
        this.name = name;
        this.categoria = categoria;
        this.autor = autor;
        numLibro++;
    }

    public String getName() {
        return name;
    }

    public void setCategoria(int numero) {
        switch (numero) {
            case 1:
                this.categoria = "Cocina";
                break;
            case 2:
                this.categoria = "Filosofía";
                break;
            case 3:
                this.categoria = "Ciencia";
                break;
            case 4:
                this.categoria = "Novela";
                break;
            default:
                this.categoria = "Categoría desconocida";
                break;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + name + ", Autor: " + autor + ", Categoría: " + categoria;
    }

    public void getInfoLibro() {
        System.out.println(name + " fue escrito por " + autor + " y pertenece al género literario " + categoria);
    }
}