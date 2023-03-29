package Setordenacion;

import java.util.ArrayList;
import java.util.TreeSet;

public class PersonajeTS implements Comparable <TipoArmadura> {

	
	private String nombre ; 
	private int salud ; 
	private int mana ;
	private TreeSet<TipoArmadura>armadura;
	private Arma armaD; 
	private Arma armaI;
	
	
	
	public PersonajeTS(String nombre, int salud, int mana, Arma armaD, Arma armaI) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.armadura = new TreeSet <>();
		this.armaD = armaD;
		this.armaI = armaI;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getSalud() {
		return salud;
	}



	public void setSalud(int salud) {
		this.salud = salud;
	}



	public int getMana() {
		return mana;
	}



	public void setMana(int mana) {
		this.mana = mana;
	}



	public Arma getArmaD() {
		return armaD;
	}



	public void setArmaD(Arma armaD) {
		this.armaD = armaD;
	}



	public Arma getArmaI() {
		return armaI;
	}



	public void setArmaI(Arma armaI) {
		this.armaI = armaI;
	}



	@Override
	public int compareTo(TipoArmadura o) {
	
		return 0; 
	}
	
	
	
	
	
}
