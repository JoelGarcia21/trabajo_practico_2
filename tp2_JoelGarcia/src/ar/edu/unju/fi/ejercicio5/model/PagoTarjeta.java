package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.IPago;

public class PagoTarjeta implements IPago {
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	
	
	
	public PagoTarjeta(String numeroTarjeta, LocalDate pago, double montoPagado) {
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = pago;
		this.montoPagado = montoPagado;
	}
	
	public PagoTarjeta() {
		// TODO Auto-generated constructor stub
	}	
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate pago) {
		this.fechaPago = pago;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub
		
	}
}
