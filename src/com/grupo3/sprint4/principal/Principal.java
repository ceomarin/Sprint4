package com.grupo3.sprint4.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.grupo3.sprint4.clases.Administrativo;
import com.grupo3.sprint4.clases.Asesoria;
import com.grupo3.sprint4.clases.Capacitacion;
import com.grupo3.sprint4.clases.Cliente;
import com.grupo3.sprint4.clases.Contenedor;
import com.grupo3.sprint4.clases.Profesional;

public class Principal {
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
	public static ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
	public static Contenedor contenedor = new Contenedor(listaAsesoria,listaCapacitacion);
	
	
	public static void main(String[] args) {
		boolean salida = false;
		int tarea=0;
//		ArrayList<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		
		
		
		while(!salida) {
			menu();
			System.out.println("Escribe el número de la tarea a realizar");
			tarea= entrada.nextInt();
			
	        switch(tarea){
	        case 1:
	        	almacenarCliente();
//	        	Cliente cliente1 = new Cliente("john","Doe",LocalDate.of(1980,12,01),11111111,"123456789","Cuprum",1,"Socoroma 555","Santiago");
//	        	contenedor.almacenarCliente(cliente1);
//	        	contenedor.listarUsuarios();
	            break;
	        case 2:
	        	almacenarProfesional();
	        	Profesional profesional1 = new Profesional("john","Doe",LocalDate.of(1980,12,01),11111111,"Licenciado",LocalDate.of(2022,01,02));
	        	contenedor.almacenarCliente(profesional1);
	        	contenedor.listarUsuarios();
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
        System.out.println("7: Listar usuarios");
        System.out.println("8: Listar capacitaciones");
        System.out.println("9: Salir");
	}
	
	public static void almacenarCliente() {
		System.out.println("Has seleccionado la opcion 1");
		
		System.out.print("Ingrese Rut del Cliente, sin puntos ni guion: ");
		int run = entrada.nextInt();
		
		System.out.print("Ingrese Nombres del Cliente: ");
		String nombres = entrada.next();
		nombres += entrada.nextLine();
		
		System.out.print("Ingrese Apellidos del Cliente: ");
		String apellidos = entrada.nextLine();
		
		System.out.print("Ingrese fecha de nacimiento del usuario (DD/MM/AAAA): ");
		String fechaString = entrada.next();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);

		System.out.print("Igrese telefono del Cliente: ");
		String telefono = entrada.nextLine();
		
		
		System.out.print("Ingrese afp del Cliente: ");
		String afp = entrada.nextLine();
		
		System.out.print("Ingrese Sistema de salud: 1 (Fonasa) o 2 (Isapre): ");
		int sistemaSalud = entrada.nextInt();
		
		System.out.print("Ingrese direccion del Cliente: ");
		String direccion = entrada.nextLine();
		
		System.out.print("Ingrese comuna del Cliente: ");
		String comuna = entrada.nextLine();
		
		Cliente cliente = new Cliente(nombres,apellidos,fechaNacimiento,run,telefono,afp,sistemaSalud,direccion,comuna);
    	contenedor.almacenarCliente(cliente);
    	contenedor.listarUsuarios();
		
	}
	
	public static void almacenarProfesional() {
		System.out.println("Has seleccionado la opcion 2");
		System.out.print("Ingrese Rut del Cliente, sin puntos ni guion: ");
		int run = entrada.nextInt();
		
		System.out.print("Ingrese Nombre del Profesional: ");
		String nombres = entrada.next();
		nombres += entrada.nextLine();
		
		System.out.print("Ingrese Apellidos del Profesional: ");
		String apellidos = entrada.nextLine();

		System.out.print("Ingrese fecha de Nacimiento (DD/MM/AAAA): ");
		String dateStringNacimiento = entrada.next();
		//convert String to LocalDate
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate diaFechaNacimiento = LocalDate.parse(dateStringNacimiento, formatter);
		
		System.out.print("Ingrese Titulo del Profesional: ");
		String titulo = entrada.nextLine();
		
		System.out.print("Ingrese fecha de Ingreso (DD/MM/AAAA): ");
		String dateStringIngreso = entrada.next();
		DateTimeFormatter formatterIngreso =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate diaIngreso = LocalDate.parse(dateStringIngreso, formatterIngreso);
		
		Profesional profesional = new Profesional(nombres,apellidos,diaFechaNacimiento,run,titulo,diaIngreso);
		contenedor.almacenarProfesional(profesional);
		contenedor.listarUsuarios();
		
	}
	
	public static void almacenarAdministrativo() {
		System.out.println("Has seleccionado la opcion 3");
		System.out.print("Ingrese Rut, sin puntos ni guion: ");
		int run = entrada.nextInt();
		
		System.out.print("Ingrese Nombres: ");
		String nombres = entrada.next();
		nombres += entrada.nextLine();
		
		System.out.print("Ingrese Apellidos: ");
		String apellidos = entrada.nextLine();

		System.out.print("Ingrese fecha de Nacimiento (DD/MM/AAAA): ");
		String dateStringNacimiento = entrada.next();
		//convert String to LocalDate
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate diaFechaNacimiento = LocalDate.parse(dateStringNacimiento, formatter);
		
		System.out.print("Ingrese Area: ");
		String area = entrada.nextLine();
		
		System.out.print("Ingrese Experiencia previa: ");
		String experienciaPrevia = entrada.nextLine();
		
		Administrativo administrativo = new Administrativo(nombres,apellidos,diaFechaNacimiento,run,area,experienciaPrevia);
		contenedor.almacenarAdministrativo(administrativo);
		contenedor.listarUsuarios();
	}

	public static void almacenarCapacitacion() {
		System.out.println("Has seleccionado la opcion 4");
		System.out.print("Ingrese Rut, sin puntos ni guion: ");
		int run = entrada.nextInt();
		
		System.out.print("Ingrese fecha de la Capacitacion (DD/MM/AAAA): ");
		String dateString = entrada.next();
		//convert String to LocalDate
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate diaCapacitacion = LocalDate.parse(dateString, formatter);
		
		System.out.print("Ingrese hora de la capacitacion (HH:MM): ");
		String horaString = entrada.next();
        String[] partes = horaString.split(":");
        String hora = partes[0];
        String minuto = partes[1];
        LocalTime horaCapacitacion = LocalTime.of(Integer.parseInt(hora), Integer.parseInt(minuto),0);
        
        System.out.print("Ingrese lugar de la Capacitacion: ");
		String lugar = entrada.nextLine();
		
		System.out.print("Ingrese duracion en horas de la Capacitacion: ");
		int duracion = entrada.nextInt();
		
		System.out.print("Ingrese cantidad de asistentes a la Capacitacion: ");
		int cantidadAsistentes = entrada.nextInt();
		
		Capacitacion capacitacion = new Capacitacion(run,diaCapacitacion,horaCapacitacion,lugar,duracion,cantidadAsistentes);
		contenedor.almacenarCapacitacion(capacitacion);
		
	}
	
	public static void eliminarUsuario() {
		System.out.println("Has seleccionado la opcion 5");
		System.out.print("Ingrese Rut del Cliente, sin puntos ni guion a Eliminar: ");
		int run = entrada.nextInt();
		contenedor.eliminarUsuario(run);
	}
	
	public static void listarUsuarios() {
		System.out.println("Has seleccionado la opcion 6");
		contenedor.listarUsuarios();
	}
	
	public static void listarUsuariosPorTipo() {
		System.out.println("Has seleccionado la opcion 7");
		System.out.print("Ingrese Tipo de Usuario a Listar: Cliente, Profesional o Administrativo.: ");
		String tipoUsuario = entrada.nextLine();
		contenedor.listarUsuariosPorTipo(tipoUsuario);
		
	}
	
	public static void listarCapacitaciones() {
		System.out.println("Has seleccionado la opcion 8");
		contenedor.listarCapacitaciones();
	}
}
