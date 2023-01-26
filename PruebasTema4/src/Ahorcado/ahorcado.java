package Ahorcado;

public class ahorcado {

	private static String[] palabras = {"perro", "ordenador", "avion"};
	private String palabraAdivinar ; 
	private String palabraActual ; 
	private int fails ; 
	
	
	public void Ahorcado() {
		fails =0 ; 
	
		int indice = (int)(Math.random()*palabras.length-1); 
	
		this.palabraAdivinar=palabras[indice]; 
		
	
	}
	
}
