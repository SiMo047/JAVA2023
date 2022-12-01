package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in); 
		int num ; 
		
		System.out.println("Introduzca un numero");
		
		num= Integer.parseInt(sc.nextLine());
		
		for(int i=2 ; i<=num ; i++ ) {
		if (i%2!=0) {
			System.out.print(i+" ");
		}
		}

	}

}
