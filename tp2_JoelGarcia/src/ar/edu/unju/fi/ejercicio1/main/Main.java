package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;



public class Main {

	public static void main(String[] args) {
				//Crea un arraylist productos
				List<Producto> productos = new ArrayList<>();
				
				//crea un objeto producto
				Producto producto = new Producto();
				
				//Scanner para seleccionar opcion
				Scanner sc = new Scanner(System.in);
				int opc=0;
				
				do {
					try {
						System.out.println("********* MENU *******");
						System.out.println(" 1-Crear un producto");
						System.out.println(" 2-Mostrar productos");
						System.out.println(" 3-Modificar producto");
						System.out.println(" 4-Salir");
						System.out.println();
						System.out.println("**********************");
						opc = sc.nextInt();
						sc.nextLine();
						}catch( java.util.InputMismatchException ex ) {
							System.out.println("Error: ingrese opciones válidas");
					        System.out.println();
					        sc.nextLine(); // Limpiar el buffer del scanner
						}
						
						if( productos.isEmpty() && opc!=1) {		
							System.out.println("Error: no hay productos!");
							System.out.println();
								
						}else {
							switch( opc ) {
							case 1: 
								producto.crearProducto( productos, sc );
								break;
							case 2:
								producto.mostrarProducto(productos);
								break;
							case 3:
								producto.modificarProduto(productos, sc);
								break;
							case 4:
								System.out.println("Saliendo...");
								break;
							default:
								System.out.println("Error: opcion no valida");	
								System.out.println();
								break;
							}
						}		
					}while( opc!=4 );			
				sc.close();
			}
	}
