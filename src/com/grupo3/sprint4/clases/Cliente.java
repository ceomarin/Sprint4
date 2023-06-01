package com.grupo3.sprint4.clases;

public class Cliente extends Usuario{
	 private int rut;
	    private String nombres;
	    private String apellidos;
	    private String telefono;
	    private String afp;
	    private String sistemaSalud;
	    private String direccion;
	    private String comuna;
	    private int edad;

	    public Cliente(){

	    }

	    public Cliente (int rut, String nombres, String apellidos, String telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {

	        this.rut = rut;
	        this.nombres = nombres;
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
	        '}';
	    }

}