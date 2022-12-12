package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*funcion para pintar array */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner (System.in); 
		
		int array[] = new int[5];

		
		System.out.println("introduce 5 numeros ");
		
		for(int i =0 ; i<array.length ; i++) {
			int num = Integer.parseInt(sc.nextLine()); 
			array[i]= num ; 
		}
		
		pintarvector(array); 
		
		boolean crece = false , decrece = false ; 
		
		for (int i =0 ; i<4 ; i++) {
			
			if ( array[i]<array[i+1]) {
				crece=true ; 
			}
			
			if (array[i]>array[i+1]) {
				decrece = true ;
			}
		}
		
		if (crece==true && decrece==false ) {
			System.out.print("Los numeros de la tabla estan en orden creciente" );
		}else if (crece == false && decrece == true ){
			System.out.print("Los numeros de la  tabla estan en orden decreciente ");
		} else if (crece == true && decrece == true ) {
			System.out.print("Los numeros de la  tabla estan desordenados ");
		} else if ( crece == false && decrece == false ) {
			System.out.print("Los numeros de la  tabla son iguales");
		}
		
		
	}

}
