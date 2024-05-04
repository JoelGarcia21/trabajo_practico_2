package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

public static void main(String[] args) {

FelinoSalvaje gato = new FelinoSalvaje("Tanner", (byte)20, 186.0f);
		
		//Verifica que gato no sea nulo
		if (Converter.isNotNull(gato)) {
			//Define el convertidor de FelinoSalvaje a FelinoDomestico
			Converter<FelinoSalvaje, FelinoDomestico> converter = fs -> new FelinoDomestico(fs.getNombre(), fs.getEdad(), fs.getPeso());
			
			//Realiza la conversion utilizando el converter
			FelinoDomestico felinoDomestico = converter.convert(gato);
			
			// Mostrar el objeto felino doméstico utilizando el método mostrarObjeto()
			converter.mostrarObjeto(felinoDomestico);
		}else {
			System.out.println("El objeto a convertir es nulo");
		}

	}

}
