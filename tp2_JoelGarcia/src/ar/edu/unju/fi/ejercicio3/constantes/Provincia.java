package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {

	JUJUY(672260, 53219), // población en 2010 según INDEC, superficie en km^2 según INDEC
    SALTA(1333365, 155488),
    TUCUMAN(1694653, 22524),
    CATAMARCA(367828, 102606),
    LA_RIOJA(331847, 89680),
    SANTIAGO_DEL_ESTERO(874006, 136351);
	
	private int poblacion;
	private double superficie;
	
	private Provincia(int poblacion, double superficie) {
		this.poblacion = poblacion;
		this.superficie = superficie;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public double getSuperficie() {
		return superficie;
	}

	//Metodo para calcular la densidad poblacional
	private double calcularDensidad() {
		return (double) poblacion/superficie;
	}
	
	
}
