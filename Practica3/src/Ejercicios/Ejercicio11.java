package Ejercicios;
import java.util.Scanner ; 
public class Ejercicio11 {

	public static int digitos(int num ) {
		
		int division , cont=0 ; 
	
		
	do {
		division = num /10 ;
		num = division ; 
		cont ++ ; 
		
	}while(division>0); 
		
		
		
		return cont ; 
		
	}
	
	
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in); 
		
		System.out.println("Introduce un numero , para indicarle cuantos digitos tiene ");
		
		int num ; 
		
		num = Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println("Este numero "+num+" tiene "+digitos(num)+" digitos");

	}

}
