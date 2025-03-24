package com.example;
import java.util.Date;
import java.util.List;


public class Prestamos { 
    private Usuario usuario;
    private Libro libro;
    private Date fechaDePrestamo;
    private Date fechaDeDevolucionPrevista;


    public Prestamos(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaDePrestamo = new Date();
        this.fechaDeDevolucionPrevista = new Date(fechaDePrestamo.getTime() + (14L * 24 * 60 * 60 * 1000)); 
    }

    public Prestamos(List<Usuario> usuarios, List<Libro> libros) {

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public Date getFechaDeDevolucionPrevista() {
        return fechaDeDevolucionPrevista;
    }


    public long calcularDiasDeRetraso() {
        Date hoy = new Date();
        if (hoy.after(fechaDeDevolucionPrevista)) {
            long diferenciaMillis = hoy.getTime() - fechaDeDevolucionPrevista.getTime();
            return diferenciaMillis / (24 * 60 * 60 * 1000);
        }
        return 0;
    }


    
    public String toString() {
        return "Préstamo:\n" +
               "Libro: " + libro.getTitulo() + "\n" +
               "Usuario: " + usuario.getNombre() + "\n" +
               "Fecha de préstamo: " + fechaDePrestamo + "\n" +
               "Fecha de devolución prevista: " + fechaDeDevolucionPrevista + "\n" +
               "Retraso: " + calcularDiasDeRetraso() + " días";
    }
}
