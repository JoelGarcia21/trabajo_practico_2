package ar.edu.unju.fi.ejercicio2.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.model.Efemeride;


public class Main {

	public static void main(String[] args) {

		//Lista para almacenar los objetos Efemeride
		List<Efemeride> efemeridesList = new ArrayList<>();
		
		//Objeto Efemeride
		Efemeride efemeride = new Efemeride();
		
		Scanner sc = new Scanner(System.in);
		byte opc=0; 
		
			do {
				try {
					System.out.println("***************");
					System.out.println("1- Crear efemeride");
					System.out.println("2- Mostrar efemerides");
					System.out.println("3- Eliminar efemeride");
					System.out.println("4- Modificar efemeride");
					System.out.println("5- Salir");
					System.out.println();
					System.out.println("***************");
					opc = sc.nextByte();
					
					if(efemeridesList.isEmpty() && opc!=1) {
						System.out.println("Error: no hay efemerides, intente primero crear una.");
						System.out.println();
					}else {
						switch( opc ) {
						/*case 1:
							efemeride.crearEfemeride( efemeridesList, sc );
							break;
						case 2:
							efemeride.mostrarEfemeride( efemeridesList );
							break;
						case 3:
							efemeride.eliminarEfemeride( efemeridesList, sc );
							break;
						case 4:
							efemeride.modificarEfemeride( efemeridesList, sc );*/
						default:
							System.out.println("Opcion no valida");
						}
					}
				}catch( java.util.InputMismatchException ex ) {
					System.out.println("Error al ingresar opcion, intentelo nuevamente.");
					System.out.println();
					sc.nextLine(); //Limpiar buffer
				}
				
			}while( opc != 5 );
			sc.close();
		}

	}
