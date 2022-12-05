package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in); 
		
		int num , acum= 0 ; 
		
		System.out.println("Introduce un numero ");
		num=Integer.parseInt(sc.nextLine()); 
		
		if(num>1&&num<10 ) {
		for ( int i =1  ; i<=10 ; i++) {
			
			acum=num*i; 
			
		System.out.println(num+"*"+i+"="+acum);
		}
		
		}else {
			System.out.println("Introduce un numero entre el 1 y el 10 ");
		}
		
		
		
	}

}
