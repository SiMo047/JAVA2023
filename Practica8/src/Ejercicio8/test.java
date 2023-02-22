package Ejercicio8;

public class test {

	public static void main(String[] args) {


		
		Arma a1 = new Arma ("Subfusil",1000,40); 
		Jugador j1 = new Jugador ("R","Gigante",10000);
		Partida p1 = new Partida (j1);
		
		
		
		p1.iniciarPartida(a1);
		
		for(int i=0; i < 50; i++) {					
			if (p1.turnoJugador()) {
				System.out.println("Ha ganado el jugador");
				break;
			}
			
			if (p1.turnoEnemigo()) {
				System.out.println("Los enemigos han derrotado al jugador");
				break;
			}
			
			System.out.println(p1);
			
			
		}

		
	}
		
		
	
		
	}


