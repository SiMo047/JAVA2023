package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in); 
		
		System.out.println("Introduce dos numero positivos");
		int num =Integer.parseInt(sc.nextLine()); 
		int num1 = Integer.parseInt(sc.nextLine()); 
	
	for ( int i = num ; i < num1 ; i++ ) {
		if ( i%2==0) {
			System.out.print(i+"-");
		}
	}
	
	}

}
