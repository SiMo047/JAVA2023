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
		
		for (int i =0 ; i<=100;i++) {
			
			enemigos.add(new Enemigo ("Enemigo","Mago",50));
		}
		
		this.jugador.setArma(arma);
	}
	
	public boolean turnoJugador () {
	
			for ( Enemigo e : this.enemigos) {
					
				if (enemigos.isEmpty()== true ) {
					return true ;
					} else {
						
						if (e.getSalud()<=0) {
									/*eliminar el objeto del array */
							enemigos.remove(e);
						}else {
							this.jugador.golpear(e);
						}
					}
			}
			return false ; 
	}
	
public boolean turnoEnemigo() {
	for (Enemigo e : this.enemigos) {
		
		if (e.getSalud()>0) {
		   e.golpear(jugador);
		   if(jugador.getSalud()<0) {
			   return true; 
		   }
		   break;
		}
	}
	return false;
}



@Override
public String toString() {
	return "Partida [jugador=" + jugador + "]";
}	
	
	
	
	
	
	
}
