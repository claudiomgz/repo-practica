package ejercicio01;

import java.time.LocalDate;

public class Venta {
	private Integer numero;
	private Double monto;
	private LocalDate fecha;
	
	public Double getValorTotal() {
		return monto;
	}
	public void setValorTotal(Double valorTotal) {
		this.monto = valorTotal;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
