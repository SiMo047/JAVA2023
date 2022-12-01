package Ejercicios;
import java.util.Scanner ; 

public class Ejercicio2 {

	public static void main(String[] args) {
	

Scanner sc = new Scanner(System.in); 
int num=1 ; 
do {
System.out.println("Introduce un numero para indicarte si es multiplo de los siguientes "
		+ "(2,3,5 o 7)");



num = Integer.parseInt(sc.nextLine()); 

	
	
if (num%2==0) {
	System.out.println(num + " Es multiplo de 2 ");
}else if(num%3==0) {
		System.out.println(num + " Es multiplo de 3 ");
	}else if (num%5==0) {
		System.out.println(num + " Es multiplo de 5 ");
	} else if (num%7==0) {
		System.out.println(num + " Es multiplo de 7 ");
	}
else {
	System.out.println("No es multiplo de ninguno");
}

}while(num>0); 


		
	}

}
