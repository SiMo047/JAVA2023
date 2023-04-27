package Ejercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Stim {

	
	private ArrayList <Juego>juegos ; 
	private LinkedList<Usuario>jugadores ;
	
	
	
	public Stim() {
		super();
		
		this.juegos= new ArrayList <>(); 
		this.jugadores= new LinkedList <>(); 
	}



	public ArrayList<Juego> getJuegos() {
		return juegos;
	}



	public LinkedList<Usuario> getJugadores() {
		return jugadores;
	}
	
	
	public void addJuego (Juego juego) {
		int p = this.juegos.indexOf(juego);
		
		if (p<0) {
			this.juegos.add(juego); 
		}
		
	}
	
	
	public void delJuego (Juego juego) {
		this.juegos.remove(juego);
	}
	
	public void addJugador(Usuario usu) {
	
		this.jugadores.add(usu); 
	}
	

	public String pintarJuegos () {
		StringBuilder sb = new StringBuilder ();
		
		for (Juego j : this.juegos) {
			sb.append(j); 
			sb.append("\n"); 
			
		}
		
		return sb.toString();
	}
	

	public String pintarJugadores () {
		StringBuilder sb = new StringBuilder ();
		
		for (Usuario u : this.jugadores) {
			sb.append(u); 
			sb.append("\n"); 
			
		}
		
		return sb.toString();
	}
	
	
	
	
	public TreeSet <Puntuacion> obtPuntuaciones (Juego j ){
		
		TreeSet <Puntuacion>punt = new TreeSet<>();
	
		for (Usuario u : this.jugadores) {
				Puntuacion p =u.getPuntuacion(j); 
				punt.add(p);
				
		}
		
		return punt;
		
	}
	
	
	
	
}
