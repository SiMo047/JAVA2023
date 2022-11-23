package Test;
import java.util.Scanner;
public class EjemploSc {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int opcion=0 ;
		
			do {	
				
				
					System.out.println("1.Saludar");
					System.out.println("2.Despedirse");
					System.out.println("3.Darse la mano ");
					System.out.println("4.Salir");
						
					
					System.out.println("Elige una opcion ");
					opcion = Integer.parseInt(sc.nextLine()); 
					
					switch (opcion) {
					case 1: {
						System.out.println("Hola quetal");break; 
						
					}
				case 2: {
					System.out.println("Helloo");break; 
						
					}
				case 3: {
					System.out.println("VAMOS ");break; 
					
				}
				case 4: {
					System.out.println("Fin programa  ");break; 
					
				}
					
					}
					
			}while (opcion!=4);
		
	}

}
