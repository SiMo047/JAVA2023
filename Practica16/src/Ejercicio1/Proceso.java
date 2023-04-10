package Ejercicio1;

import java.util.ArrayList;
import java.util.Objects;

public class Proceso {

	
	
	private int pid ; 
	private String nombre ;
	private String cpu ; 
	private String ram ; 
	private boolean prioridad ;
	
	
	public Proceso(int pid, String nombre, String cpu, String ram, boolean prioridad) {
		super();
		this.pid = pid;
		this.nombre = nombre;
		this.cpu = cpu;
		this.ram = ram;
		this.prioridad = prioridad;
	
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public boolean isPrioridad() {
		return prioridad;
	}


	public void setPrioridad(boolean prioridad) {
		this.prioridad = prioridad;
	}


	@Override
	public String toString() {
		return "Proceso [pid=" + pid + ", nombre=" + nombre + ", cpu=" + cpu + ", ram=" + ram + ", prioridad="
				+ prioridad + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proceso other = (Proceso) obj;
		return pid == other.pid;
	} 
	

	
	
	
	
	
	
}
