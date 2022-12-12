package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*funcion para pintar array */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int array[] = new int[5];
		
		int ultimo ; 
		System.out.println("introduce 5 numeros ");

		for (int i =0 ; i<array.length;i++) {
			int num = Integer.parseInt(sc.nextLine()); 
			array[i]= num ; 
			
		}
		ultimo = array[4]; 
		pintarvector(array); 
		System.out.println();
		
		for (int i = 3 ; i>=0 ; i--) {
			array[i+1]=array[i]; 
		}
		array[0]=ultimo; 

		pintarvector(array); 
	}

}
