package ar.edu.unju.fi.ejercicio3.main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio3.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		//Array para guardar los objetos Provincia
		List<Provincia> provincias =  new ArrayList<>();
		
		// Agregar las provincias al ArrayList
        provincias.add(Provincia.JUJUY);
        provincias.add(Provincia.SALTA);
        provincias.add(Provincia.TUCUMAN);
        provincias.add(Provincia.CATAMARCA);
        provincias.add(Provincia.LA_RIOJA);
        provincias.add(Provincia.SANTIAGO_DEL_ESTERO);
		
		//Mostrar informacion de cada provincia
		for (Provincia provincia : provincias) {
			System.out.println("Provincia: "+provincia);
			System.out.println("Cantidad de poblacion: "+provincia.getPoblacion());
			System.out.println("Superficie: "+provincia.getSuperficie());
			System.out.println("Densidad poblacional: "+provincia.calcularDensidad()+" hab/km^2");
			System.out.println();
			System.out.println("------------------------");
		}
		

	}

}
