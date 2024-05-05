package ar.edu.unju.fi.ejercicio7.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5.model.Producto;

public class Main {
	private static List<Producto> productosArray;
	public static void main(String[] args) {
		productosArray = new ArrayList<>();
	    
	    cargarProductos();
	    
	    Scanner sc = new Scanner(System.in);
	    byte opc;
	    
	    do {
	    	System.out.println("================================================================");
	    	System.out.println("1-Mostrar productos");
	    	System.out.println("2-Mostrar productos faltantes");
	    	System.out.println("3-Incrementar los precios de los productos un 20%");
	    	System.out.println("4-Mostrar los productos electronicos");
	    	System.out.println("5-Ordenar los productos por precio de forma descendente");
	    	System.out.println("6-Mostrar los productos con los nombres en mayucuslas");
	    	System.out.println("7-Salir");
	    	System.out.println();
	    	System.out.println("================================================================");
	    	opc = sc.nextByte();
	    	
	    	switch (opc){
	    	/*case 1:
	    		mostrarProductos();
	    		break;
	    	case 2:
	    		mostrarProductosFaltantes();
	    		break;
	    	case 3:
	    		incrementarPrecios();
	    		break;
	    	case 4:
	    		mostrarProductosElectronicos();
	    		break;
	    	case 5:
	    		ordenarProductos();
	    		break;
	    	case 6:
	    		convertirNombres();
	    		break;*/
	    	case 7:
	    		System.out.println("Saliendo...");
	    		break;
	    	default:
	    		System.out.println("Opcion no valida");
	    	}
	    }while (opc!=7);
	
	    sc.close();
	}

	
	public static void cargarProductos() {
		Producto producto1 = new Producto(1, "Camiseta", 1500.0d, "China", "Ropa", true);
        Producto producto2 = new Producto(2, "Pantalón", 2500.0d, "India", "Ropa", true);
        Producto producto3 = new Producto(3, "Zapatos", 4000.0d, "Italia", "Calzado", false);
        Producto producto4 = new Producto(4, "Sombrero", 1000.0d, "México", "Accesorios", true);
        Producto producto5 = new Producto(5, "Bufanda", 1250.0d, "Francia", "Accesorios",false);
        Producto producto6 = new Producto(6, "Reloj", 10000.0d, "Suiza", "Accesorios",true);
        Producto producto7 = new Producto(7, "Gafas de sol", 2000.0d, "China", "Accesorios",true);
        Producto producto8 = new Producto(8, "Mochila", 3000.0d, "Vietnam", "Accesorios",true);
        Producto producto9 = new Producto(9, "Libro", 900.0d, "EEUU", "Libros", true);
        Producto producto10 = new Producto(10, "Pelota", 550.0d, "China", "Deportes", true);
        Producto producto11 = new Producto(11, "Raqueta de tenis", 5000.0d, "Japón", "Deportes", false);
        Producto producto12 = new Producto(12, "Bicicleta", 30000.0d, "Alemania", "Deportes", true);
        Producto producto13 = new Producto(13, "Televisor", 50000.0d, "Corea del Sur", "Electrónico", true);
        Producto producto14 = new Producto(14, "Teléfono", 90000.0d, "China", "Electrónico", false);
        Producto producto15 = new Producto(15, "Notebook", 190000.0d, "Taiwán", "Electrónico", true);
        
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
        
	}
}
