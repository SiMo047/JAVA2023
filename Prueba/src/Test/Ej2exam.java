package Test;

import java.util.Scanner;

public class Ej2exam {
	
	public static int buscar (String palabras[] , String palabra) {
		
		for (int i=0 ;i<palabras.length;i++) {
			if (palabras[i].compareTo(palabra)==0) {
				return i ; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		String palabrasES [] = { "hola", "casa", "perro", "mono", "coche", "tren", "luna", "juego", "mesa", "gente" };
		String palabrasIN [] = { "hello", "home", "dog", "monkey", "car", "train", "moon", "game", "table", "people" };
		
		
		String palabra = " ";
		int opcion = 0 ; 
		int posicion =0; 
		Scanner sc = new Scanner (System.in); 
		
		do {
			System.out.println("Elige opción:");
			System.out.println("1. ES a IN");
			System.out.println("2. IN a ES");
			System.out.println("3. Salir");
			System.out.println("introduce tu eleccion");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				System.out.println("Traduciendo español - inglés ...");
				System.out.println("Introduce palabra: ");
				palabra = sc.nextLine();
				posicion= buscar(palabrasES,palabra);
				System.out.println("La traduccion es "+palabrasIN[posicion]);
			}break;
			case 2: {
				System.out.println("Traduciendo ingles - español ...");
				System.out.println("Introduce palabra: ");
				palabra = sc.nextLine();
				posicion= buscar(palabrasIN,palabra);
				System.out.println("La traduccion es "+palabrasES[posicion]);
				
			}break;
			
			case 3:{
				
				System.out.println("Saliendo ....");
				
				}break; 
			}
			
			
			
		}while (opcion!=3); 
		
		
		
		
	
	}

}
