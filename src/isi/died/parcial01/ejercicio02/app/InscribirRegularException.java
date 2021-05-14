package isi.died.parcial01.ejercicio02.app;

public class InscribirRegularException extends Exception {
	public InscribirRegularException() {
		System.out.println("El alumno no posee una inscripción a cursado con el estado REGULAR en la materia que se quiere inscribir.");
	}
}