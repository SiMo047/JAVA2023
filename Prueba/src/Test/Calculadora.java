package Test;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner (System.in);
		
		int opcion=0 , num1=0 , num2=0  ; 
		double resultado ; 
		do {
						System.out.println("1.Sumar");
						System.out.println("2.Restar");
						System.out.println("3.Multiplicar ");
						System.out.println("4.Dividir");
						System.out.println("5.Salir");
						
						
						System.out.println("Elige una de las opciones ");
						opcion = Integer.parseInt(sc.nextLine()); 
					if (opcion!=5) {	
						System.out.println("Introduce el primer numero ");
						num1= Integer.parseInt(sc.nextLine()); 
						
						System.out.println("Introduce el segundo numero ");
						num2= Integer.parseInt(sc.nextLine()); 
					}
						
						
						switch (opcion) {
						case 1: {System.out.println("Suma"); 
							resultado=num1+num2 ; 
							System.out.println("El resultado es "+resultado);break;}
						case 2: {System.out.println("Resta");
							resultado=num1-num2 ; 
							System.out.println("El resultado es "+resultado);break;}
						case 3: {System.out.println("Multiplicacion");
							resultado=num1*num2 ; 
							System.out.println("El resultado es "+resultado);break;}
						case 4: {System.out.println("Division");
							resultado=num1/num2 ; 
							System.out.println("El resultado es "+resultado);break;}
						case 5: {System.out.println("Fin programa ");break;}
					
						}
		}while (opcion!=5);
		
		}

}
