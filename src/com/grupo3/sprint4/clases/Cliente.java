package com.grupo3.sprint4.clases;
import java.util.ArrayList;

public class Cliente extends Usuario{
	    private String apellidos;
	    private String telefono;
	    private String afp;
	    private String sistemaSalud;
	    private String direccion;
	    private String comuna;
	    private int edad;
	    private ArrayList<Capacitacion> capacitacion;
	    private ArrayList<Accidente> accidente;
	    private ArrayList<VisitaEnTerreno> visitaTerreno;

	    public Cliente(){

	    }

	    public Cliente (String apellidos, String telefono,
	    		String afp, String sistemaSalud, String direccion, String comuna, int edad) {
	    	super();
	        this.apellidos = apellidos;
	        this.telefono = telefono;
	        this.afp = afp;

	       // if (sistemaSalud.equals("Fonasa") || sistemaSalud.equals("Isalpre")) {
	       //     this.sistemaSalud = sistemaSalud;
	       // } else {
	       //     System.out.println("no es una opcion valida");
	       // }

	        this.direccion = direccion;
	        this.comuna = comuna;
	        this.edad = edad;
	    }
	    public int getRut() {
	        return rut;
	    }

	    public void setRut(int rut) {
	        this.rut = rut;
	    }

	    public String getNombres() {
	        return nombres;
	    }

	    public void setNombres(String nombres) {
	        this.nombres = nombres;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

	    public String getAfp() {
	        return afp;
	    }

	    public void setAfp(String afp) {
	        this.afp = afp;
	    }
	    public String getSistemaSalud() {
	        return sistemaSalud;
	    }

	    public void setSistemaSalud(String sistemaSalud) {
	        this.sistemaSalud = sistemaSalud;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getComuna() {
	        return comuna;
	    }

	    public void setComuna(String comuna) {
	        this.comuna = comuna;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public ArrayList<Capacitacion> getCapacitacion() {
	        return capacitacion;
	    }

	    public void setCapacitacion(ArrayList<Capacitacion> capacitacion) {
	        this.capacitacion = capacitacion;
	    }
	    
	    public ArrayList<Accidente> getAccidente() {
	        return accidente;
	    }

	    public void setAccidente(ArrayList<Accidente> accidente) {
	        this.accidente = accidente;
	    }
	    
	    public ArrayList<VisitaEnTerreno> getvisitaTerreno() {
	        return visitaTerreno;
	    }

	    public void setVisitaTerreno(ArrayList<VisitaEnTerreno> visitaTerreno) {
	        this.visitaTerreno = visitaTerreno;
	    }
	    
	    
	    public String obtenerNombre() {
	        return nombres + " " + apellidos;
	    }

	    public void obtenerSistemaSalud() {
	        if (sistemaSalud == 1) {
	            System.out.println("Sistema de salud: Fonasa");
	        } else if (sistemaSalud == 2) {
	            System.out.println("Sistema de salud: Isapre");
	        }
	    }

	    @Override
	    public void analizarUsuario() {
	        super.analizarUsuario();
	        System.out.println("Dirección: " + direccion);
	        System.out.println("Comuna: " + comuna);
	    }
	    

	    @Override
	    public String toString() {
	        return "Cliente{" +
	        "rut=" + rut +
	        ", nombres='" + nombres + '\'' +
	        ", apellidos='" + apellidos + '\'' +
	        ", telefono='" + telefono + '\'' +
	        ", afp='" + afp + '\'' +
	        ", sistemaSalud='" + sistemaSalud + '\'' +
	        ", direccion='" + direccion + '\'' +
	        ", comuna='" + comuna + '\'' +
	        ", edad=" + edad +
	        ", capacitacion=" + capacitacion +
	        ", accidente=" + accidente +
	        ", visitaTerreno=" + visitaTerreno +
	        '}';
	    }

}
