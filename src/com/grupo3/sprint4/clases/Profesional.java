package com.grupo3.sprint4.clases;

public class Profesional {
	private String titulo;
    private String fechaIngreso;

    public Profesional(String titulo, String fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    // Gett y sett

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String toString() {
        return "Profesional{" + "titulo='" + titulo + '\'' + ", fechaIngreso='" + fechaIngreso + '\'' + '}';
    }
}
