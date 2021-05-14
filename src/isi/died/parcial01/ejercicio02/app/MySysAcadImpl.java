package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.dominio.*;
import isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(insc);
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		
		try {
			DB.guardar(e);
		}
		catch(BaseDeDatosExcepcion e1){
			
			e1.printStackTrace();
		}
	}
	
	public void registrarNota(Examen e,Integer nota) {
		e.setNota(nota);
		if(nota>5) {
			List<Inscripcion> cursadas = e.getAlumno().getCursadas();
			cursadas = cursadas.stream().filter(m -> m.getMateria().equals(e.getMateria())).collect(Collectors.toList());
			cursadas.get(cursadas.size()-1).setEstado(Estado.PROMOCIONADO);
					
		}
	}


	@Override
	public List<Materia> materiasAprobadas(Alumno m) {
		// TODO Auto-generated method stub
		return null;
	}

}
