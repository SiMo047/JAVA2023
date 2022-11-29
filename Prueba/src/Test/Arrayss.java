package Test;
import java.util.Scanner;
public class Arrayss {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		
		
		int numero[] = new int [6]; 
		
		System.out.println("Introduce 6 numeros ");
		for (int i=0 ; i < numero.length ; i++) {
			
			int num = Integer.parseInt(sc.nextLine()) ; 
			numero[i]= num ; 
		}
		
		
		for (int i =0 ; i < numero.length; i++) {
			System.out.print(numero[i]);
			
		}
		
		
		System.out.println("");
		int mayor= numero[0]; 
		int posicion =0 ; 
		
		for (int i =0 ; i < numero.length; i++) {
		
			if (mayor<numero[i]) {
				mayor=numero[i]; 
				posicion = i ; 
			}
				
		
			
		}
		
		System.out.println(mayor);
		
	
	}

}
