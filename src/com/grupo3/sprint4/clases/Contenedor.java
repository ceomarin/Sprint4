package com.grupo3.sprint4.clases;

import java.util.ArrayList;

public class Contenedor {
	
	 private ArrayList<Asesoria> asesorias;
	    private ArrayList<Capacitacion> capacitaciones;

	    public Contenedor() {
	        asesorias = new ArrayList<>();
	        capacitaciones = new ArrayList<>();
	    }

	    public void almacenarCliente(Asesoria cliente) {
	        asesorias.add(cliente);
	    }

	    public void almacenarProfesional(Asesoria profesional) {
	        asesorias.add(profesional);
	    }

	    public void almacenarAdministrativo(Asesoria administrativo) {
	        asesorias.add(administrativo);
	    }

	    public void almacenarCapacitacion(Capacitacion capacitacion) {
	        capacitaciones.add(capacitacion);
	    }

	    public void eliminarUsuario(int run) {
	        for (Asesoria asesoria : asesorias) {
	            if (asesoria instanceof Usuario && ((Usuario) asesoria).getRun() == run) {
	                asesorias.remove(asesoria);
	                break;
	            }
	        }
	    }

	    public void listarUsuarios() {
	        for (Asesoria asesoria : asesorias) {
	            if (asesoria instanceof Usuario) {
	                System.out.println(asesoria);
	            }
	        }
	    }

	    public void listarUsuariosPorTipo(String tipo) {
	        for (Asesoria asesoria : asesorias) {
	            if (asesoria.getClass().getSimpleName().equals(tipo)) {
	                System.out.println(asesoria);
	            }
	        }
	    }

	    public void listarCapacitaciones() {
	        for (Capacitacion capacitacion : capacitaciones) {
	            System.out.println(capacitacion);
	        }
	    }

	
}
