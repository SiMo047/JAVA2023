package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in); 
		
		
		System.out.println("Introduce un numero ");
	int num = Integer.parseInt(sc.nextLine()); 
	int divisores=0 ; 
	
	for (int i =1 ; i <=num ; i++) {
		if (num%i==0) {
			divisores = i ;
			System.out.println("Estos son sus divisores "+divisores);
		}
	
	}
	

	}

}
