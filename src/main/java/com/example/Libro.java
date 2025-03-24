package com.example;

public class Libro {

        private int idLibro;
        private String Titulo;
        private String autor;
        private int añoDePublicacion;
        private String isbn;
        private boolean Disponibilidad;


        public void libro(int idLibro, String titulo, String autor, int añoDePublicacion, String isbn, boolean Disponibilidad, String Titulo) {
            this.idLibro = 0;
            this.Titulo = "";
            this.autor = "";
            this.añoDePublicacion = 0;
            this.isbn = "";
            this.Disponibilidad = false;



        }
        public int getIdLibro() {
            return idLibro;
        }

        public void setIdLibro(int idLibro) {
                this.idLibro = idLibro;
        }


        public String getTitulo() {
            return Titulo;
        }


        public void setTitulo(String titulo) {
            this.Titulo = titulo;
        }


        public String getAutor() {
            return autor;
        }


        public void setAutor(String autor) {
            this.autor = autor;
        }


        public int getAñoDePublicacion() {
            return añoDePublicacion;
        }


        public void setAñoDePublicacion(int añoDePublicacion) {
            this.añoDePublicacion = añoDePublicacion;
        }


        public String getIsbn() {
            return isbn;
        }


        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }


        public boolean getDisponibilidad() {
            return Disponibilidad;
        }


        public void setDisponibilidad(boolean Disponibilidad) {
            this.Disponibilidad = Disponibilidad;
        }

        public void prestarLibro() {
            if (Disponibilidad == true) {
                Disponibilidad = false;
            } else {
                System.out.println("El libro no esta disponible");
            }
        }
        public void devolverLibro() {
            if (Disponibilidad == false) {
                Disponibilidad = true;
            } else {
                System.out.println("El libro ya esta disponible");
            }
        }
            public String toString() {
                return "Producto{" +
                        "idLibro=" + idLibro +
                        "Titulo='" + Titulo + '\'' +
                        ",autor=" + autor +
                        ", isbn=" + isbn +
                        ", año de publicacion=" + añoDePublicacion +
                        ", disponibilidad=" + Disponibilidad +
                        '}';

            

        }

    



}