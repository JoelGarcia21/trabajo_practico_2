package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
			double peso, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	//Calcula edad por la fecha de nacimiento del jugador
	public int calcularEdad(LocalDate fechaNacimiento) {
		int edad=0;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		edad=periodo.getYears();
		return edad;
		
	}
	
	//Crea un nuevo jugador y lo agrega a un arraylist
	public void darAltaJugador(List<Jugador> jugadores, Scanner sc) {
		byte posicion = 0;
		
		try {
			System.out.println("Ingrese nombre: ");
			String nombre = sc.nextLine();
			
			System.out.println("Ingrese apellido: ");
			String apellido = sc.nextLine();
			
			System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
			String fechaString = sc.nextLine();
			
			//Formatea la fecha
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);
			
			System.out.println("Ingrese nacionalidad: ");
			String nacionalidad = sc.nextLine();
			
			System.out.println("Ingrese estatura (metros): ");
			double estatura = sc.nextDouble();
			
			System.out.println("Ingrese peso (kilogramos): ");
			double peso = sc.nextDouble();
			
			do {
				System.out.println("Ingrese posicion: ");
				System.out.println("1: Delantero 2:Medio 3:Defensa 4:arquero");
				posicion = sc.nextByte();
			}while(posicion>4 || posicion<1);
			
			//Objeto Posicion vacio 
			Posicion posicionObjeto=null;
			
			switch(posicion) {
			case 1:
				posicionObjeto = Posicion.DELANTERO;
				break;
			case 2:
				posicionObjeto = Posicion.MEDIO;
				break;
			case 3:
				posicionObjeto = Posicion.DEFENSA;
				break;
			case 4:
				posicionObjeto = Posicion.ARQUERO;
				break;
			}
			//Se crea objeto Jugador con loa atributos
			Jugador nuevoJugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicionObjeto);
			
			//Se agrega nuevoJugador al arraylist
			jugadores.add(nuevoJugador);
			
			System.out.println("Nuevo jugador añadido!");
			System.out.println();
			} catch ( java.util.InputMismatchException e ) {
				System.out.println("Error al ingresar los datos del jugador, recuerde respetar el formato. ");
				System.out.println();
				sc.nextLine(); //limpia buffer
			}catch ( java.time.format.DateTimeParseException e) {
			    System.out.println("Error al ingresar la fecha de nacimiento, recuerte respetar el formato ");
			    System.out.println();
			    sc.nextLine(); //limpia buffer
			}
	}
	
	//Muestra todos los jugadores del arraylist
	public void mostrarJugadores(List<Jugador> jugadores) {
		
		for(Jugador jugador : jugadores ) {
			System.out.println("Nombre: "+jugador.getNombre());
			System.out.println("Apellido: "+jugador.getApellido());
			System.out.println("Fecha de nacimiento: "+jugador.getFechaNacimiento());
			System.out.println("Edad: "+calcularEdad(jugador.getFechaNacimiento())+" años");
			System.out.println("Nacionalidad: "+jugador.getNacionalidad());
			System.out.println("Estatura: "+jugador.getEstatura()+"m");
			System.out.println("Peso: "+jugador.getPeso()+"kg");
			System.out.println("Posicion: "+jugador.getPosicion());
			System.out.println();
			System.out.println("-----------------------");
		}
		
	}
}
