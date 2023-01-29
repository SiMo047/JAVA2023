package Ejercicio9;

public class test {

	public static void main(String[] args) {

		Jugador j1 = new Jugador ("j1","MAGO",58); 
		Enemigo en = new Enemigo ("en1",190,50 );
		
	
		
		j1.subirNivel();
		
		j1.golpearEnem(en);
		en.golpearJuga(j1);
		
		
		
		System.out.println(en);
		System.out.println(j1);
		
	}

}
