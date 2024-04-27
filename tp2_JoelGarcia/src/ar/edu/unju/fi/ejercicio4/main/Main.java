package ar.edu.unju.fi.ejercicio4.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.model.Jugador;


public class Main {

	public static void main(String[] args) {
		Jugador jugador = new Jugador(); //Objeto jugador
		List<Jugador> jugadores = new ArrayList<>();  //Arraylist para objetos Jugador
		Scanner sc = new Scanner(System.in); 
		
		byte opc; //Variable para elejir una opcion
		
		try {
			do {
				System.out.println("----- MENU -----");
				System.out.println("1-Dar de Alta a jugador");
				System.out.println("2-Mostrar todos los jugadores");
				System.out.println("3-Modificar posicion de un jugador");
				System.out.println("4-Eliminar un jugador");
				System.out.println("5-Salir");
				opc = sc.nextByte();
				
				if( jugadores.isEmpty() && opc!=1 ){
					System.out.println("ERROR: la lista de jugadores esta vacia.");
				}else {
					
					switch (opc) {
		             case 1: 
		                // jugador.darAltaJugador();
		                 break;
		             case 2:
		            	 //jugador.mostrarJugadores();
		                 break;
		             case 3:
		                 //jugador.modificarPosicion();
		                 break;
		             case 4:
		            	 //jugador.eliminarJugador();
		                 break;
		             case 5:
		                 System.out.println("Saliendo...");
		                 break;
		             default:
		                 System.out.println("Opcion invalida");
					}
					}
				}while( opc!=5 );
		}catch( java.util.InputMismatchException ex ) {
			System.out.println("Error al ingresar opcion, intentelo nuevamente.");
			System.out.println();
			sc.nextLine(); //Limpiar buffer
		}
		sc.close();
	}
}
