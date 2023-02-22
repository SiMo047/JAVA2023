package Ejercicio8;

import java.util.ArrayList;

public class Partida {

	private Jugador jugador ; 
	private ArrayList<Enemigo>enemigos ;
	
	
	
	public Partida(Jugador jugador) {
		super();
		this.jugador = jugador;
		this.enemigos = new ArrayList<>();
	} 
	
	
	
	public void iniciarPartida(Arma arma ) {
		
		for (int i =0 ; i<5;i++) {
			
			enemigos.add(new Enemigo ("Enemigo","Mago",5));
		}
		
		this.jugador.equiparArma(arma);;
	}
	
	public boolean turnoJugador () {
	
		/*el jugador golpeara al primer enemigo del array list */
		this.jugador.golpear(this.enemigos.get(0));
		
		
		/*Comprobamos si la salud es igual o menos que cero si es asi 
		 * eliminamos el enemigo del array
		 */
		if ( this.enemigos.get(0).getSalud()<=0){
			this.enemigos.remove(0); 
		}
		
		/*si no hay mas enemigos en el array eso significa que el jugador ha 
		 * ganado 
		 */
		if (this.enemigos.size()==0) {
			return true ; 
		}
			return false ; 
	}
	
public boolean turnoEnemigo() {

	/*comprobamos que haya enemigos en el array
	 * si es asi que realice nada 
	 */
	if (this.jugador.getSalud()<=0) {
		return true ;
	}else {
		this.enemigos.get(0).golpear(this.jugador);
		return false ;
	}
	
	
	
}





@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Partida [Jugador=");
	builder.append(jugador.getSalud());
	builder.append(" salud");
	builder.append(" nº enemigos ");
	builder.append(this.enemigos.size());
	builder.append("]");
	return builder.toString();
}
	
	
	
	
	
	
}
