package Ej1CRUD;

import java.util.ArrayList;

public class GestorAlumnos {

	private ArrayList<Alumno> alumnos;
	
	public GestorAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public GestorAlumnos() {
		alumnos = new ArrayList<>;
	}
	
	public Alumno buscarAlumnoPorSuNombre(String nombre) {
		
	}

	public boolean modificarNota(String nombre, double nuevaNota) {
		Alumno alumno = buscarAlumnoPorSuNombre(nombre);
		boolean hayModificacion = false;
		if (alumno != null) {
			alumno.setNota(nuevaNota);
		}
	}
	
	
	
	
}
