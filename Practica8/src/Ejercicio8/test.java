package Ejercicio8;

public class test {

	public static void main(String[] args) {


		
		Arma a1 = new Arma ("Subfusil",40,10); 
		Jugador j1 = new Jugador ("R","Gigante",200);
		Enemigo e1 = new Enemigo ("Enemigo", "Mago", 250);
		Partida p1 = new Partida (j1);
		
		
		
		p1.iniciarPartida(a1);

		
		for (int i=0; i<=50;i++) {
			if (i/2==0) {
				p1.turnoJugador();
			}else {
				p1.turnoEnemigo();
			}
		
		}
		
		
	
		
	}

}
