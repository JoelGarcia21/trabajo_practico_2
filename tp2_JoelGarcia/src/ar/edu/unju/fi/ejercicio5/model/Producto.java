package ar.edu.unju.fi.ejercicio5.model;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precioUnitario;
	private String origenFabricacion;
	private String catergoria;
	private boolean disponible;
	
	public Producto(int codigo, String descripcion, double precioUnitario, String origenFabricacion,
			String catergoria, boolean disponible) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origenFabricacion = origenFabricacion;
		this.catergoria = catergoria;
		this.disponible = disponible;
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


	public String getOrigenFabricacion() {
		return origenFabricacion;
	}


	public void setOrigenFabricacion(String origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}


	public String getCatergoria() {
		return catergoria;
	}


	public void setCatergoria(String catergoria) {
		this.catergoria = catergoria;
	}


	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+"$"+ ", origenFabricacion=" + origenFabricacion + ", catergoria=" + catergoria + ", diponible="+disponible+"]";
	}
}
