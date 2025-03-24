package com.example;
import com.example.Prestamos;


public class Main {
    public static void main(String[] args) {
        Biblioteca bibli1 = new Biblioteca();
        

        Libro libro1 = new Libro();
        libro1.setTitulo("El principito");
        libro1.setAutor("Antoine de Saint-Exupéry");
        libro1.setAñoDePublicacion(1943);
        libro1.setIsbn("978-84-206-8187-4");
        bibli1.agregarLibro(libro1);

        Libro libro2 = new Libro();
        libro2.setTitulo("El señor de los anillos");
        libro2.setAutor("J.R.R. Tolkien");
        libro2.setAñoDePublicacion(1954);
        libro2.setIsbn("978-84-450-7370-7");
        bibli1.agregarLibro(libro2);

        Usuario usuario1 = new Usuario(1, "Juan", "juanMM@gmail.com" );
        bibli1.registrarUsuario(usuario1);
        bibli1.prestarLibro(usuario1, libro1);
        bibli1.prestarLibro(usuario1, libro2);
        System.out.println(bibli1.consultarPrestamos(usuario1));
        bibli1.devolverLibro(usuario1, libro1);
        System.out.println(bibli1.consultarPrestamos(usuario1));
        bibli1.generarInforme();

        Usuario usuario2 = new Usuario(2, "Ana", "juliana1234@gmail.com" );
        bibli1.registrarUsuario(usuario2);
        bibli1.prestarLibro(usuario1, libro1);
        bibli1.prestarLibro(usuario2, libro2);
        
        System.out.println(bibli1.buscarLibros("El"));
        System.out.println(bibli1.consultarPrestamos(usuario1));
        System.out.println(bibli1.consultarPrestamos(usuario2));
        bibli1.devolverLibro(usuario1, libro1);
        System.out.println(bibli1.consultarPrestamos(usuario1));
        System.out.println(bibli1.consultarPrestamos(usuario2));
        bibli1.generarInforme();



    }
}