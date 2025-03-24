package com.example;
import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private ArrayList<String> prestamosActuales;

    public Usuario(int idUsuario, String nombre, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.prestamosActuales = new ArrayList<>();
    }

    public int getidUsuario() {
        return idUsuario;
    }

    public void setidUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getPrestamosActuales() {
        return prestamosActuales;
    }

    public void setPrestamosActuales(ArrayList<String> prestamosActuales) {
        this.prestamosActuales = prestamosActuales;


    }


    public void agregarprestamos  (String prestamo) {
        this.prestamosActuales.add(prestamo);
        System.out.println("El usuario "+ nombre +" ha prestado: " + prestamo);
    }

    public void mostrarprestamosactuales(String prestamo) {
        System.out.println("El usuario "+ nombre +" tiene prestado: " + prestamo);
    }

    public void devolverprestamos  (String prestamo) {
        this.prestamosActuales.remove(prestamo);
        System.out.println("El usuario "+ nombre +" ha devuelto: " + prestamo);
    }

    public String toString() {
        return "Usuario ID: " + idUsuario + "\n" +
               "Nombre: " + nombre + "\n" +
               "Email: " + email + "\n" +
               "Préstamos Actuales: " + prestamosActuales + "\n";
  

    }



    

}


