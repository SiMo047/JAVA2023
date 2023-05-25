package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
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
	
	
	
	
	public TreeMap<Puntuacion, Usuario> obtPuntuaciones (Juego j ){
		
		TreeMap <Puntuacion,Usuario>punt = new TreeMap<>();
	
		for (Usuario u : this.jugadores) {
				Puntuacion p =u.getPuntuacion(j); 
			if (p!=null) {
				punt.put(p, u);
			}	
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



public void pintarRankingjuego() {
	
	for ( Juego j : this.juegos) {
		
		System.out.println(j.getNombre());
		
		TreeMap <Puntuacion,Usuario> pu = this.obtPuntuaciones(j);
		Set <Puntuacion> puntos= pu.keySet();
		
		for (Puntuacion p: puntos ) {
			System.out.println(pu.get(p).getNick()+ " Puntos= "+p.getPuntos());
		}
		
		
	}
}


/*******METODOS STREAMS*******/

/*metodo que pinta cada usuario con su respectivo nick y email */
public void pintarUsuarioporNick() {
	
	this.jugadores.stream()
	.sorted((ju1,ju2)-> ju1.getNick().compareTo(ju2.getNick()))
	.map(ju -> ju.getNick()+ " - "+ju.getEmail())
	.forEach(System.out::println);
	
}

public void pintarUsuarioPuntuacin () {
	
	this.jugadores.stream()
	.forEach(
			ju -> ju.getNick() 
			);
	
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
					System.out.println(ju.getNombre()+"  "+j.getPuntuacion(ju)) ;
				
				});	
	
	});
	
}



}


	
	


	
