package ejercicio01;

import java.util.ArrayList;
import java.util.Calendar;

public class EnConvenio extends Empleado {
	private Integer antiguedad;
	private Double sueldo;
	public void setSueldoBasico(Double s) {
		this.sueldo=s;
	}
	
	public EnConvenio() {
		listaDeVentas = new ArrayList<Venta>();
	}
	
	public double costo() {
		double aux = sueldo;
		for(Venta unaVenta: listaDeVentas) {
			aux += unaVenta.getValorTotal();
		}
		Calendar.getInstance();
		if(fechaNacimiento.MONTH == Calendar.MONTH) aux+=20000.0;
		return aux;
	}
}


