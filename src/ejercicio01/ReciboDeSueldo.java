package ejercicio01;


public class ReciboDeSueldo {
	
	private Integer numero;
	private Integer mes;
	private Double valorTotal;
	private Empleado empleado;
	
	public ReciboDeSueldo(Integer n, Integer mes, Empleado e) {
		this.setNumero(n);
		this.setMes(mes);
		this.empleado=e;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}