package Ejercicio8;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class NotasCurso {


	enum EtapaEducativa {ESO, Bachillerato, FPBasica, FPMedio, FPSuperior};
	enum Curso {n1,n2,n3,n4};
	
	
	
	private EtapaEducativa ee ; 
	private String nombreCiclo ;
	private Curso curso ; 
	private HashMap <String , Double >notas ; 
	private Integer anio ;

	
	
	public NotasCurso(EtapaEducativa ee, String nombreCiclo, Curso curso, Integer anio) {
		super();
		this.ee = ee;
		this.nombreCiclo = nombreCiclo;
		this.curso = curso;
		this.anio = anio;
		this.notas= new HashMap<>();
	}



	public EtapaEducativa getEe() {
		return ee;
	}



	public void setEe(EtapaEducativa ee) {
		this.ee = ee;
	}



	public String getNombreCiclo() {
		return nombreCiclo;
	}



	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	public Integer getAnio() {
		return anio;
	}



	public void setAnio(Integer anio) {
		this.anio = anio;
	}



	public HashMap getNotas() {
		return notas;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [ee=");
		builder.append(ee);
		builder.append(", nombreCiclo=");
		builder.append(nombreCiclo);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", anio=");
		builder.append(anio);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(anio, curso, ee, nombreCiclo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		return Objects.equals(anio, other.anio) && curso == other.curso && ee == other.ee
				&& Objects.equals(nombreCiclo, other.nombreCiclo);
	}
	
	
	
	
	public void addNota (String asignatura , Double nota ) {
		this.notas.put(asignatura, nota);
	}
	
	
	public void deleteNota (String asignatura) {
		this.notas.remove(asignatura);
	}
	
	
	public Double buscarNota(String asignatura ) {
		return (Double) this.notas.get(asignatura);
	}
	

	
	public String pintar() {
		
		
		Set <String> asignaturas = new TreeSet(notas.keySet());
		
		StringBuffer sb = new StringBuffer ();
		
		for (String s : asignaturas ) {
			sb.append(s);
			sb.append(" : "); 
			sb.append(notas.get(s));
			sb.append("\n");
		}
		
		return sb.toString();
		
	}
	
	
	
	
	
	

}
