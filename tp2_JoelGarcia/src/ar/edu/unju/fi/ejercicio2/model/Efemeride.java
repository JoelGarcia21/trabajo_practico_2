package ar.edu.unju.fi.ejercicio2.model;

import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;

public class Efemeride {

	private int codigo;
	private Mes mes;
	private int dia;
	private String detalle;
	
	public Efemeride() {
		// TODO Auto-generated constructor stub
	}

	public Efemeride(int codigo, Mes mes, int dia, String detalle) {
		super();
		this.codigo = codigo;
		this.mes = mes;
		this.dia = dia;
		this.detalle = detalle;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Efemeride [codigo=" + codigo + ", mes=" + mes + ", dia=" + dia + ", detalle=" + detalle + "]";
	}
	
	//crea un nuevo objeto Efemeride y lo agrega a un array
		public void crearEfemeride( List<Efemeride> efemerides, Scanner sc ) {
			//Se crea un objeto mes vacio para el mes
			Mes mesObjeto =  null;
			int mes=0;
			int dia=0;
			
			try {
				System.out.println("Ingrese codigo: ");
				int codigo = sc.nextInt();
				sc.nextLine();
				
				do {
					System.out.println("Ingrese mes (1-12)");
					mes = sc.nextInt();
					sc.nextLine();
					
					switch( mes ) {
					case 1:
						mesObjeto = Mes.ENERO;
						break;
					case 2:
						mesObjeto = Mes.FEBRERO;
						break;
					case 3:
						mesObjeto = Mes.MARZO;
						break;
					case 4:
						mesObjeto = Mes.ABRIL;
						break;
					case 5:
						mesObjeto = Mes.MAYO;
						break;
					case 6:
						mesObjeto = Mes.JUNIO;
						break;
					case 7:
						mesObjeto = Mes.JULIO;
						break;
					case 8:
						mesObjeto = Mes.AGOSTO;
						break;
					case 9:
						mesObjeto = Mes.SEPTIEMBRE;
						break;
					case 10:
						mesObjeto = Mes.OCTUBRE;
						break;
					case 11:
						mesObjeto = Mes.NOVIEMBRE;
						break;
					case 12:
						mesObjeto = Mes.DICIEMBRE;
						break;
					}
				}while( mes>12 || mes<1 );
				
				if( mes==2 ) {
					do {
						System.out.println("Ingrese dia para "+mesObjeto+" (1-28): "); 
						dia = sc.nextInt();
						sc.nextLine();
					}while( dia<1 || dia>28);
				}else if( mes==4 || mes==6 || mes==8 || mes==11) {
					do {
						System.out.println("Ingrese dia para "+mesObjeto+" (1-30): "); 
						dia = sc.nextInt();
						sc.nextLine();
					}while( dia<1 || dia>30);
				}else {
					do {	
					System.out.println("Ingrese dia para "+mesObjeto+" (1-31): "); 
					dia = sc.nextInt();
					sc.nextLine();
					}while( dia<1 || dia>31);
				}
				
				System.out.println("Ingrese detalles: ");
				String detalle = sc.nextLine();
			
				Efemeride nuevoEfemeride = new Efemeride(codigo, mesObjeto, dia, detalle);
				efemerides.add(nuevoEfemeride);
				System.out.println("Nuevo efemeride creado!");
				System.out.println();
				
			}catch( java.util.InputMismatchException ex ) {
				System.out.println("Error al ingresar datos, intentelo nuevamente");
				System.out.println();
				sc.nextLine(); //Limpiar buffer
			}
		}
		
		
		//Muestra todos los objetos del arraylist efemerides
		public void mostrarEfemeride(List<Efemeride> efemerides) {
			
			System.out.println("Efemerides: ");
			System.out.println();
			for( int i=0 ; i<efemerides.size() ; i++ ) {
				System.out.println("Codigo: "+efemerides.get(i).getCodigo());
				System.out.println("Mes: "+efemerides.get(i).getMes());
				System.out.println("Dia: "+efemerides.get(i).getDia());
				System.out.println("Detalle: "+efemerides.get(i).getDetalle());
				System.out.println();
				System.out.println("________________");
			}
		}
		
		//Elimina un objeto Efemide del arraylist
		public void eliminarEfemeride(List<Efemeride> efemerides, Scanner sc) {
			try {
				System.out.println("Ingrese codigo para Eliminar: ");
				int codigoBuscar = sc.nextInt();
				sc.nextLine();
					
				boolean codigoExiste=false;
				
				
				for( int i=0 ; i<efemerides.size() ; i++ ) {
					if( efemerides.get(i).getCodigo() == codigoBuscar ) {
						codigoExiste=true;
						efemerides.remove(i);
						System.out.println("Efemeride eliminado con exito!");
						System.out.println();
					}
				}
				if(!codigoExiste) {
					System.out.println("Codigo no encontrado!");
				}
			}catch( java.util.InputMismatchException ex ) {
					System.out.println("Error al ingresar datos, intentelo nuevamente");
					System.out.println();
					sc.nextLine(); //Limpiar buffer
				}
		}
		
		//Modifica un objeto Efemide del arraylist
		public void modificarEfemeride( List<Efemeride> efemerides, Scanner sc ) {
			
			System.out.println("Ingrese codigo para modificar: ");
			int codigoBuscar = sc.nextInt();
			boolean codigoExiste=false;
			sc.nextLine();
			
			for( int i=0 ; i<efemerides.size() ; i++ ) {
				if( efemerides.get(i).getCodigo() == codigoBuscar ) {
					codigoExiste=true;
					//Se crea un objeto mes vacio para el mes
					Mes mesObjeto =  null;
					int mes=0;
					int dia=0;
					try {
						System.out.println("Ingrese nuevo codigo: ");
						int codigo = sc.nextInt();
						sc.nextLine();
						
						do {
							System.out.println("Ingrese nuevo mes (1-12)");
							mes = sc.nextInt();
							sc.nextLine();
							
							switch( mes ) {
							case 1:
								mesObjeto = Mes.ENERO;
								break;
							case 2:
								mesObjeto = Mes.FEBRERO;
								break;
							case 3:
								mesObjeto = Mes.MARZO;
								break;
							case 4:
								mesObjeto = Mes.ABRIL;
								break;
							case 5:
								mesObjeto = Mes.MAYO;
								break;
							case 6:
								mesObjeto = Mes.JUNIO;
								break;
							case 7:
								mesObjeto = Mes.JULIO;
								break;
							case 8:
								mesObjeto = Mes.AGOSTO;
								break;
							case 9:
								mesObjeto = Mes.SEPTIEMBRE;
								break;
							case 10:
								mesObjeto = Mes.OCTUBRE;
								break;
							case 11:
								mesObjeto = Mes.NOVIEMBRE;
								break;
							case 12:
								mesObjeto = Mes.DICIEMBRE;
								break;
							}
						}while( mes>12 || mes<1 );
						
						if( mes==2 ) {
							do {
								System.out.println("Ingrese dia para "+mesObjeto+" (1-28): "); 
								dia = sc.nextInt();
								sc.nextLine();
							}while( dia<1 || dia>28);
						}else if( mes==4 || mes==6 || mes==8 || mes==11) {
							do {
								System.out.println("Ingrese dia para "+mesObjeto+" (1-30): "); 
								dia = sc.nextInt();
								sc.nextLine();
							}while( dia<1 || dia>30);
						}else {
							do {	
							System.out.println("Ingrese dia para "+mesObjeto+" (1-31): "); 
							dia = sc.nextInt();
							sc.nextLine();
							}while( dia<1 || dia>31);
						}
						
						System.out.println("Ingrese nuevos detalles: ");
						String detalle = sc.nextLine();
					
						Efemeride nuevoEfemeride = new Efemeride(codigo, mesObjeto, dia, detalle);
						efemerides.set(i, nuevoEfemeride);
						System.out.println("Efemeride modificado con exito!");
						System.out.println();
					}catch( java.util.InputMismatchException ex ) {
						System.out.println("Error al ingresar datos, intentelo nuevamente");
						System.out.println();
						sc.nextLine(); //Limpiar buffer
					}
				}
				if(!codigoExiste) {
					System.out.println("Codigo no encontrado!");
					System.out.println();
				}
			}
		}
	
}
