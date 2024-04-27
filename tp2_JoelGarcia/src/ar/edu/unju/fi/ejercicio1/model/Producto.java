package ar.edu.unju.fi.ejercicio1.model;

import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.constantes.Categoria;
import ar.edu.unju.fi.ejercicio1.constantes.OrigenFabricacion;


public class Producto {

	private int codigo;
	private String descripcion;
	private double precioUnitario;
	private OrigenFabricacion origenFabricacion;
	private Categoria catergoria;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int codigo, String descripcion, double precioUnitario, OrigenFabricacion origenFabricacion,
			Categoria catergoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origenFabricacion = origenFabricacion;
		this.catergoria = catergoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}

	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}

	public Categoria getCatergoria() {
		return catergoria;
	}

	public void setCatergoria(Categoria catergoria) {
		this.catergoria = catergoria;
	}
	
	//Crea un objeto Producto y lo agrega a un arraylist 
	public void crearProducto( List<Producto> productos, Scanner sc ) {
		int origenOpc=0;
		int catergoriaOpc=0;
		OrigenFabricacion origenFabricacion = null;
		Categoria categoria = null;
		
		System.out.println("Ingrese codigo: ");
		try {
			int codigo = (sc.nextInt());
			sc.nextLine();
			
			if ( validarCodigoUnico(codigo, productos )) {  //Llama al metodo validarCodigo
				System.out.println("Ingrese descripcion: ");
				String descripcion = sc.nextLine();
				
				System.out.println("Ingrese precio unitario: ");
				double precio = sc.nextDouble();
				
				do {
				System.out.println();
				System.out.println("----  Origen de fabricacion  -----");
				System.out.println("1-Argentina");
				System.out.println("2-China");
				System.out.println("3-Brasil");
				System.out.println("4-Uruguay");
				System.out.println("----------------------------------");
				System.out.println();
				origenOpc=sc.nextInt();
				sc.nextLine();
				}while( (origenOpc != 1) && (origenOpc != 2) && (origenOpc != 3) && (origenOpc != 4) ); //Bucle que no termina hasta que el usuario coloque una opcion correcta
				
				switch( origenOpc ) {
				case 1:
					 origenFabricacion = OrigenFabricacion.ARGENTINA;
					break;
				case 2:
					 origenFabricacion = OrigenFabricacion.CHINA;
					break;
				case 3:
					 origenFabricacion = OrigenFabricacion.BRASIL;
					break;
				case 4:
					 origenFabricacion = OrigenFabricacion.URUGUAY;
					break;
				}
				
				do {
					System.out.println();
					System.out.println("----  Categoria  -----");
					System.out.println("1-Telefonia");
					System.out.println("2-Informatica");
					System.out.println("3-Electro hogar");
					System.out.println("4-Herramientas");
					System.out.println("----------------------");
					System.out.println();
					catergoriaOpc=sc.nextInt();
					sc.nextLine();
					}while( (catergoriaOpc != 1) && (catergoriaOpc != 2) && (catergoriaOpc != 3) && (catergoriaOpc != 4) ); //Bucle que no termina hasta que el usuario coloque una opcion correcta
					
					switch( catergoriaOpc ) {
					case 1:
						 categoria = Categoria.TELEFONIA;
						break;
					case 2:
						 categoria = Categoria.INFORMATICA;
						break;
					case 3:
						 categoria = Categoria.ELECTROHOGAR;
						break;
					case 4:
						 categoria = Categoria.HERRAMIENTAS;
						break;
					}
				
					Producto nuevoProducto =  new Producto(codigo, descripcion, precio, origenFabricacion, categoria);
					productos.add(nuevoProducto);
					System.out.println("Nuevo producto creado con exito!");
					System.out.println();
			
			}else {
				System.out.println("Error: ese producto ya existe!");
				System.out.println();
			}
		}catch( java.util.InputMismatchException ex ) {
			System.out.println(" incorrecto. Intente nuevamente con un valor válido.");
	        System.out.println();
	        sc.nextLine(); // Limpiar el buffer del scanner
		}
	}
	
	//Muestras todos los objetos Producto del arraylist
	public void mostrarProducto( List<Producto> productos ) {
		System.out.println("Productos ");
		System.out.println();
		for( int i=0 ; i<productos.size() ; i++ ) {
			System.out.println("Codigo: "+productos.get(i).getCodigo());
			System.out.println("Descripcion: "+productos.get(i).getDescripcion());
			System.out.println("Precio unitario: "+productos.get(i).getPrecioUnitario());
			System.out.println("Origen de fabricacion: "+productos.get(i).getOrigenFabricacion());
			System.out.println("Categoria: "+productos.get(i).getCatergoria());
			System.out.println();
			System.out.println("----------------------");
		}
	}
	
	//Busca y modifica un producto del array por codigo
	public void modificarProduto(List<Producto> productos, Scanner sc){
		
		boolean codigoEncontrado = false;
		System.out.println("Ingrese codigo: ");
		int codigoBuscar = sc.nextInt();
		sc.nextLine();
		
		//Busca el codigo en el array
		for( int i=0 ; i<productos.size() ; i++ ) {
			if( codigoBuscar == productos.get(i).getCodigo() ) {
				codigoEncontrado=true;
				//Si encuentra el codigo del producto vuelve a solicitar los atributos del producto
				int origenOpc=0;
				int catergoriaOpc=0;
				OrigenFabricacion origenFabricacion = null;
				Categoria categoria = null;
				int codigo = productos.get(i).getCodigo();
				
				System.out.println("Ingrese nueva descripcion: ");
				String descripcion = sc.nextLine();
				
				System.out.println("Ingrese nuevo precio unitario: ");
				double precio = sc.nextDouble();
				
				do {
				System.out.println();
				System.out.println("----  Origen de fabricacion  -----");
				System.out.println("1-Argentina");
				System.out.println("2-China");
				System.out.println("3-Brasil");
				System.out.println("4-Uruguay");
				System.out.println("----------------------------------");
				System.out.println();
				origenOpc=sc.nextInt();
				sc.nextLine();
				}while( (origenOpc != 1) && (origenOpc != 2) && (origenOpc != 3) && (origenOpc != 4) ); //Bucle que no termina hasta que el usuario coloque una opcion correcta
				
				switch( origenOpc ) {
				case 1:
					 origenFabricacion = OrigenFabricacion.ARGENTINA;
					break;
				case 2:
					 origenFabricacion = OrigenFabricacion.CHINA;
					break;
				case 3:
					 origenFabricacion = OrigenFabricacion.BRASIL;
					break;
				case 4:
					 origenFabricacion = OrigenFabricacion.URUGUAY;
					break;
				}
				
				do {
					System.out.println();
					System.out.println("----  Categoria  -----");
					System.out.println("1-Telefonia");
					System.out.println("2-Informatica");
					System.out.println("3-Electro hogar");
					System.out.println("4-Herramientas");
					System.out.println("----------------------");
					System.out.println();
					catergoriaOpc=sc.nextInt();
					sc.nextLine();
					}while( (catergoriaOpc != 1) && (catergoriaOpc != 2) && (catergoriaOpc != 3) && (catergoriaOpc != 4) ); //Bucle que no termina hasta que el usuario coloque una opcion correcta
					
					switch( catergoriaOpc ) {
					case 1:
						 categoria = Categoria.TELEFONIA;
						break;
					case 2:
						 categoria = Categoria.INFORMATICA;
						break;
					case 3:
						 categoria = Categoria.ELECTROHOGAR;
						break;
					case 4:
						 categoria = Categoria.HERRAMIENTAS;
						break;
					}
				
					Producto nuevoProducto =  new Producto(codigo, descripcion, precio, origenFabricacion, categoria);
					productos.set(i, nuevoProducto);
					System.out.println("Nuevo producto modificado con exito!");
					System.out.println();
			}
			}
			if( !codigoEncontrado ) { 
				System.out.println("Codigo no encontrado!");
				System.out.println();
			}
	}
	
	
	//Valida si el codigo es unico
	public boolean validarCodigoUnico( int codigo, List<Producto> productos  ) {
		boolean codigoUnico=true; //variable para saber si el codigo es unico
		
		//Si el array productos esta vacio no hace la validacion
		if( productos.isEmpty() ) {
			codigoUnico = true;
		}else {
		for( int i=0 ; i<productos.size() ; i++ ) { //Si no esta vacio recorre todo el array
			if( codigo == productos.get(i).getCodigo()) {  //Valida cada objeto del array para saber si se repite el atributo codigo
				codigoUnico = false;  //
			}
		}
			}
		return codigoUnico;
	}
	
}
