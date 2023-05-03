package Ejercicio3;

import java.util.TreeSet;

public class testStim {

	public static void main(String[] args) {

		
		Stim st = new Stim();
		
		Juego j1 = new Juego("Halo","Xbox");
		Juego j2 = new Juego("GTA-V","PC");
		Juego j3 = new Juego("Fifa23","PS5");
		Juego j4 = new Juego("Spider-man","PS5");
		Juego j5 = new Juego("Red Dead","PC");
		
		st.addJuego(j1);
		st.addJuego(j2);
		st.addJuego(j3);
		st.addJuego(j4);
		st.addJuego(j5);
		
		
		Usuario u1 = new Usuario("u1","u1@gmail.com","u1");
		u1.addPuntuacion(j1, true, 100);
		u1.addPuntuacion(j1, true, 80);
		u1.addPuntuacion(j2, false, -40);
		u1.addPuntuacion(j2, true, 200);
		u1.addPuntuacion(j4, true, 300);
		
		

		Usuario u2 = new Usuario("u2","u2@gmail.com","u2");
		u2.addPuntuacion(j1, true, 100);
		u2.addPuntuacion(j2, false, -100);
		u2.addPuntuacion(j2, true, 300);
		u2.addPuntuacion(j4, false, -100);
		u2.addPuntuacion(j5, true, 150);		
		
		Usuario u3 = new Usuario("u3","u3@gmail.com","u3");
		u3.addPuntuacion(j1, true, 200);
		u3.addPuntuacion(j3, false, -100);
		u3.addPuntuacion(j3, true, 200);
		u3.addPuntuacion(j4, true, 200);
		u3.addPuntuacion(j5, true, 200);
		
		Usuario u4 = new Usuario("u4","u4@gmail.com","u4");
		u4.addPuntuacion(j1, false, -100);
		u4.addPuntuacion(j1, false, -100);
		u4.addPuntuacion(j3, false, -100);
		u4.addPuntuacion(j4, true, 120);
		u4.addPuntuacion(j5, false, -100);		
		
		Usuario u5 = new Usuario("u5","u5@gmail.com","u5");
		u5.addPuntuacion(j1, true, 120);
		u5.addPuntuacion(j2, true, 120);
		u5.addPuntuacion(j3, false, -120);
		u5.addPuntuacion(j4, true, 120);
		u5.addPuntuacion(j5, true, 120);
		
	st.addJugador(u1);
	st.addJugador(u2);
	st.addJugador(u3);
	st.addJugador(u4);
	st.addJugador(u5);
	
	System.out.println(st.buscarPuntuacion(j2, u5));

	
	TreeSet <Puntuacion>ts = st.obtPuntuaciones(j5);
	for (Puntuacion p : ts) {
		System.out.println(p);
	}
	
	
	}

}
