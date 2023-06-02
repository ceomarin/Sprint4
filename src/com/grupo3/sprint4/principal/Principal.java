package com.grupo3.sprint4.principal;

import java.util.ArrayList;
import java.util.Scanner;

import com.grupo3.sprint4.clases.Asesoria;
import com.grupo3.sprint4.clases.Cliente;
import com.grupo3.sprint4.clases.Contenedor;

public class Principal {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean salida = false;
		int tarea=0;
		Contenedor contenedor = new Contenedor();
		ArrayList<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		
		
		
		while(!salida) {
			menu();
			System.out.println("Escribe el número de la tarea a realizar");
			tarea= entrada.nextInt();
			
	        switch(tarea){
	        case 1:
	        	almacenarCliente();
	        	Cliente cliente1 = new Cliente(11111111,"john","Doe","123456789","Cuprum",1,"Socoroma 555","Santiago");
	        	contenedor.almacenarCliente(cliente1);
	            break;
	        case 2:
	        	almacenarProfesional();
	            break;
	         case 3:
	        	 almacenarAdministrativo();
	            break;
	         case 4:
	        	 almacenarCapacitacion();
	             break;
	         case 5:
	        	 eliminarUsuario();
	             break;
	         case 6:
	        	 listarUsuarios();
	             break;
	         case 7:
	        	 listarUsuariosPorTipo();
	             break;
	         case 8:
	        	 listarCapacitaciones();
	             break;
	         case 9:
	        	 salida=true;
	        	 System.out.println("El sistema ha finalizado");
	        	 break;
	         default:
	            System.out.println("Numero ingresado no valido");
	        }
		}
		entrada.close();
	}
	
	
	public static void menu() {
        System.out.println("1: Almacenar cliente");
        System.out.println("2: Almacenar profesional");
        System.out.println("3: Almacenar administrativo");
        System.out.println("4: Almacenar capacitación");
        System.out.println("5: Eliminar usuario");
        System.out.println("6: Listar usuarios");
        System.out.println("7: Listar usuarios por tipo");
        System.out.println("8: Listar capacitaciones");
        System.out.println("9: Salir");
	}
	
	public static void almacenarCliente() {
		System.out.println("Has seleccionado la opcion 1");
	}
	
	public static void almacenarProfesional() {
		System.out.println("Has seleccionado la opcion 2");
	}
	
	public static void almacenarAdministrativo() {
		System.out.println("Has seleccionado la opcion 3");
	}

	public static void almacenarCapacitacion() {
		System.out.println("Has seleccionado la opcion 4");
	}
	
	public static void eliminarUsuario() {
		System.out.println("Has seleccionado la opcion 5");
	}
	
	public static void listarUsuarios() {
		System.out.println("Has seleccionado la opcion 6");
	}
	
	public static void listarUsuariosPorTipo() {
		System.out.println("Has seleccionado la opcion 7");
	}
	
	public static void listarCapacitaciones() {
		System.out.println("Has seleccionado la opcion 8");
	}
}
