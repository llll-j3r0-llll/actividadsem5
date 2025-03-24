package com.example;

import java.util.ArrayList;

import java.util.List;


public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamos> prestamos;
 
    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }
 
  
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
 
   
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
 

    public void prestarLibro(Usuario usuario, Libro libro) {
        Prestamos prestamo= new Prestamos (usuarios, libros);
        prestamos.add(prestamo);
    }
 
 
    public void devolverLibro(Usuario usuario, Libro libro) {
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuarios) && prestamo.getLibro().equals(libro)) {
                prestamos.remove(prestamo);
                break;
            }
        }
    }
 
  
    public List<Libro> buscarLibros(String criterio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            
            if (libro.getTitulo().contains(criterio) || libro.getAutor().contains(criterio)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
 

    public List<Prestamos> consultarPrestamos(Usuario usuario) {
        List<Prestamos> resultado = new ArrayList<>();
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuarios)) {
                resultado.add(prestamo);
            }
        }
        return resultado;
    }
 

    public void generarInforme() {
 
        System.out.println("Informe de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        System.out.println("Informe de usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
 
    
        System.out.println("Informe de préstamos:");
        for (Prestamos prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}