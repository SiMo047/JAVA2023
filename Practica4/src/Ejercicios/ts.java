package Ejercicios;
import java.util.Scanner ; 
public class ts {

	public static void pintarVector(int vector[]) {
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" / ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner teclado = new Scanner (System.in); 
		
		int numero[]= new int [5]; 
		int num , posicion ; 
		for (int i=0 ; i < numero.length ; i++ ) {		
			numero [i] =(int )(Math.random()* 10 + 1 ); 
			numero[4]=0; 
		}
		
		pintarVector(numero);
		System.out.println (""); 
		System.out.print("Escribe un numero ");
		num = teclado.nextInt(); 
		System.out.print ("Escribe una poscion "); 
		posicion = teclado.nextInt(); 
	
		int numero2[] = new int[5];
		for(int i=0; i<numero2.length; i++)
			numero2[i] = numero[i];
	
		pintarVector(numero2);
	
	}
	
      }