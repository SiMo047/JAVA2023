package Ejercicios;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int seg , min , h=0 ; 
		int t=3800 ; 
		
		
		min = t/60 ; 
		seg = t%60 ; 
		h=min/60; 
		min%=60;
		
		
		
		System.out.println(h+" horas "+min+" minutos "+seg+" segundos");

	}

}
