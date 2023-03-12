package Ejercicio3;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

		ArrayList<VideoJuego> videojuegos = new ArrayList<>();
		ArrayList<Serie> series = new ArrayList<>();
		
		videojuegos.add(new VideoJuego("CallOFDuty", 300, "Accion", "Activison"));
		videojuegos.add(new VideoJuego("RedDead", 310, "Aventura", "RockStarGames"));
		
		
		
		series.add(new Serie("The Last of us",1 , "accion", "..."));

		
		videojuegos.get(0).entregar();
		
		
		series.get(0).entregar();
		
		
		
		int contseries = 0;
		
		
		for(Serie serie: series) {
			if (serie.isPrestado()==true)
				contseries++;
			
			System.out.println(serie);
		}
		
		int contjuegos = 0;
		
		for(VideoJuego juego: videojuegos) {
			if (juego.isPrestado()==true)
				contjuegos++;
			System.out.println(juego);
		}
		
		System.out.println("Hay " + contseries + " series prestadas y " + contjuegos + " videojuegos prestados");
		
		
	}

}
