package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	/*funcion para pintar array */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in); 
		
		int array[] = new int[10];
		
		for (int i =0 ; i<array.length;i++) {
		
			array[i]= i ; 
			
		}
		
		pintarvector(array); 
		int ultimo = array[9];
		
		System.out.println();
		System.out.println("introduce un posicion (del 0 al 9) ");
		int posicion = Integer.parseInt(sc.nextLine()); 
	
		array[posicion]=array[posicion+2]; 
		
		pintarvector(array); 
	}

}
