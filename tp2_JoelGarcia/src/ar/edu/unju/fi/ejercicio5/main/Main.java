package ar.edu.unju.fi.ejercicio5.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5.model.Producto;

public class Main {

	public static void main(String[] args) {

		//Creacion de productos
		Producto producto1 = new Producto(1, "Camiseta", 1500.0d, "China", "Ropa", true);
        Producto producto2 = new Producto(2, "Pantalón", 2500.0d, "India", "Ropa", true);
        Producto producto3 = new Producto(3, "Zapatos", 4000.0d, "Italia", "Calzado", true);
        Producto producto4 = new Producto(4, "Sombrero", 1000.0d, "México", "Accesorios", true);
        Producto producto5 = new Producto(5, "Bufanda", 1250.0d, "Francia", "Accesorios",true);
        Producto producto6 = new Producto(6, "Reloj", 10000.0d, "Suiza", "Accesorios",true);
        Producto producto7 = new Producto(7, "Gafas de sol", 2000.0d, "China", "Accesorios",true);
        Producto producto8 = new Producto(8, "Mochila", 3000.0d, "Vietnam", "Accesorios",true);
        Producto producto9 = new Producto(9, "Libro", 900.0d, "EEUU", "Libros", true);
        Producto producto10 = new Producto(10, "Pelota", 550.0d, "China", "Deportes", true);
        Producto producto11 = new Producto(11, "Raqueta de tenis", 5000.0d, "Japón", "Deportes", true);
        Producto producto12 = new Producto(12, "Bicicleta", 30000.0d, "Alemania", "Deportes", true);
        Producto producto13 = new Producto(13, "Televisor", 50000.0d, "Corea del Sur", "Electrónica", true);
        Producto producto14 = new Producto(14, "Teléfono", 90000.0d, "China", "Electrónica", false);
        Producto producto15 = new Producto(15, "Notebook", 190000.0d, "Taiwán", "Electrónica", true);
		
        //Creacion del array
        ArrayList<Producto> productosArray = new ArrayList<>();
        
        //Se añade todos los objetos Producto al array
        productosArray.add(producto1);
        productosArray.add(producto2);
        productosArray.add(producto3);
        productosArray.add(producto4);
        productosArray.add(producto5);
        productosArray.add(producto6);
        productosArray.add(producto7);
        productosArray.add(producto8);
        productosArray.add(producto9);
        productosArray.add(producto10);
        productosArray.add(producto11);
        productosArray.add(producto12);
        productosArray.add(producto13);
        productosArray.add(producto14);
        productosArray.add(producto15);
        
        //Array para almacenar productos comprados
        ArrayList<Producto> carrito = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int opc;
		
		do {
			System.out.println("-----------------");
			System.out.println("1-Mostrar productos");
			System.out.println("2-Realizar pago");
			System.out.println("3-Salir");
			System.out.println();
			System.out.println("-----------------");
			opc=sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			case 1:
					mostrarProductos();
					break;
			case 2:
					realizarPago();
					break;
			case 3:
					System.out.println("Saliendo...");
					System.out.println();
					break;
			default:
					System.out.println("Opcion no valida!");
					System.out.println();
			}
			
		}while (opc!=3);
		
		sc.close();
	}

}
