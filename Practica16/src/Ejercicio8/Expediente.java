package Ejercicio8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import Ejercicio8.NotasCurso.EtapaEducativa;

public class Expediente {

	
	private Estudiante estudiante ; 
	private HashSet notas ; 
	private boolean activo ;
	
	
	public Expediente(Estudiante estudiante, boolean activo) {
		super();
		this.estudiante = estudiante;
		this.activo = activo;
		this.notas= new HashSet <NotasCurso>();
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public HashSet getNotas() {
		return notas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [estudiante=");
		builder.append(estudiante);
		builder.append(", activo=");
		builder.append(activo);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(estudiante);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(estudiante, other.estudiante);
	} 
	
	
	
	
	public void addNotas(NotasCurso nc ) {
		
		this.notas.add(nc);
	}
	
	

	
	
	
}
