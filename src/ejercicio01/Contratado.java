package ejercicio01;

import java.util.Calendar;

public class Contratado extends Empleado {
	private Integer horasTrabajadas;
	private Integer costoHora;
	
	
	public double costo() {
		double auxCosto = horasTrabajadas*(this.costoHora);
		double auxPorVenta = 10*costoHora;
		for(Venta unaVenta : listaDeVentas) {
			if(unaVenta.getValorTotal() > 10000.0) {
				auxCosto += auxPorVenta;
			}
		}
		if(fechaNacimiento.MONTH == Calendar.getInstance().MONTH) auxCosto+=20000.0;
		return auxCosto;
	}
	
	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public Integer getCostoHora() {
		return costoHora;
	}
	public void setCostoHora(Integer costoHora) {
		this.costoHora = costoHora;
	}
	
	
	
	
}
