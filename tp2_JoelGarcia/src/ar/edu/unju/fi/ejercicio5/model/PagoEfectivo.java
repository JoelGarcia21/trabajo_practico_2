package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio5.interfaces.IPago;

public class PagoEfectivo implements IPago{
	private double montoPagado;
	private LocalDate fechaDePago;
	
	public PagoEfectivo() {
		// TODO Auto-generated constructor stub
	}

	public PagoEfectivo(double montoPagado, LocalDate fechaDePago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaDePago = fechaDePago;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public LocalDate getFechaDePago() {
		return fechaDePago;
	}

	public void setFechaDePago(LocalDate fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	@Override
	public void realizarPago(double monto) {
		this.montoPagado=monto*0.9;
		
	}
	@Override
	public void imprimirRecibo() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Imprimiendo recibo...");
		System.out.println("----------------------------");
        System.out.println("Fecha de pago: " + fechaDePago.format(formato));
        System.out.println("Monto pagado: " + montoPagado+"$");
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
		
	}

}
