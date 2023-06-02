package com.grupo3.sprint4.clases;

import java.time.LocalDate;
import java.time.Period;

class Usuario implements Asesoria {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
    }

    public String mostrarEdad() {
    	Period edad = Period.between(fechaNacimiento, LocalDate.now());
    	return "El usuario tiene "+ edad.getYears() + " años";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }
}


