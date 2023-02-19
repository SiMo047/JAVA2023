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
		
		Enemigo enem = new Enemigo ("Enemigo","Mago",100);
		for (int i =0 ; i<=100;i++) {
			Enemigo enemCopy = enem; 
			enemigos.add(enemCopy);
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
	
public void turnoEnemigo() {
	for (Enemigo e : this.enemigos) {
		
		if (e.getSalud()>0) {
		   e.golpear(jugador);
		   if(jugador.getSalud()<0) {
			   return ; 
		   }
		   break;
		}
	}
}



@Override
public String toString() {
	return "Partida [jugador=" + jugador + "]";
}	
	
	
	
	
	
	
}
