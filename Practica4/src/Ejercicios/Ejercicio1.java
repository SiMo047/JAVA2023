package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in); 
		
		int nu[]; 
		 nu = new int[10]; 
		
		System.out.println("Introduce 10 numeros ");
		 
		for (int i =0 ; i<nu.length ; i++) {
		
			 int num = Integer.parseInt(sc.nextLine()); 
		 nu[i]=num; 
		 
		}	
		
		for (int i=0 ; i<nu.length; i++) {
			System.out.print(nu[i]+" ");
		}
	System.out.println();
	System.out.println("inverso del array ");
		
		for (int i=9 ; i>=0; i--) {
			System.out.print(nu[i]+" ");
		}
	
	}

}
