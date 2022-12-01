package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 

		int num ; 
		System.out.println("Introduzca un numero");
		num= Integer.parseInt(sc.nextLine());
		
		while ((num<1||num>10)){
			System.out.println("Introduzca un numero");
			num= Integer.parseInt(sc.nextLine()); 
		}
		System.out.println("Terminado");
	}

}
