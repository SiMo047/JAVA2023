package Ejercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
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
	
	
	
public Puntuacion buscarPuntuacion (Juego j , Usuario u ) {
	
	int pu = this.jugadores.indexOf(u);
	
	if (pu>=0) {
		int pj = this.juegos.indexOf(j);
		if (pj>=0) {
			return this.jugadores.get(pu).getPuntuacion(this.juegos.get(pj));
		
		
	}
	
	
	}
		
	return null ; 
	
}


/*******METODOS STREAMS*******/

/*metodo que pinta cada usuario con su respectivo nick y email */
public void pintarUsuarioporNick() {
	
	this.jugadores.stream()
	.sorted((u1,u2)-> u1.getNick().compareTo(u2.getNick()))
	.map(u -> u.getNick()+ " - "+u.getEmail())
	.forEach(System.out::println);
	
}


/*metodo que pinta por cada usuario sus juegos y sus puntuaciones*/

public void pintarPuntuacion() {
	
	this.jugadores.stream()
	.forEach(
			j-> {
				System.out.println(j.getNick());
				Set <Juego> juegosDenick= j.getPuntuaciones().keySet(); 
				juegosDenick.stream()
			
				.forEach(
				ju -> {
					System.out.println(ju.getNombre()+""+j.getPuntuacion(ju)) ;
				
				});	
	
	});
	
}



}


	
	


	
