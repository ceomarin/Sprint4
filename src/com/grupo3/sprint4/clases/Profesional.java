package com.grupo3.sprint4.clases;

public class Profesional extends Usuario{
	private String titulo;
    private String fechaIngreso;

    public Profesional(String titulo, String fechaIngreso) {
    	super();
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
    
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    public String toString() {
        return "Profesional{" + "titulo='" + titulo + '\'' + ", fechaIngreso='" + fechaIngreso + '\'' + '}';
    }
}
