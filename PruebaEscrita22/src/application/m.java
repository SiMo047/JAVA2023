package application;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {

		
		

	
		
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        do {
		            System.out.println("Men�:");
		            System.out.println("1. Opci�n 1");
		            System.out.println("2. Opci�n 2");
		            System.out.println("3. Opci�n 3");
		            System.out.println("4. Opci�n 4");
		            System.out.println("5. Opci�n 5");
		            System.out.println("6. Opci�n 6");
		            System.out.println("7. Opci�n 7");
		            System.out.println("8. Opci�n 8");
		            System.out.println("9. Opci�n 9");
		            System.out.println("10. Salir");
		            System.out.print("Ingrese una opci�n: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    System.out.println("Has seleccionado la Opci�n 1");
		                    break;
		                case 2:
		                    System.out.println("Has seleccionado la Opci�n 2");
		                    break;
		                case 3:
		                    System.out.println("Has seleccionado la Opci�n 3");
		                    break;
		                case 4:
		                    System.out.println("Has seleccionado la Opci�n 4");
		                    break;
		                case 5:
		                    System.out.println("Has seleccionado la Opci�n 5");
		                    break;
		                case 6:
		                    System.out.println("Has seleccionado la Opci�n 6");
		                    break;
		                case 7:
		                    System.out.println("Has seleccionado la Opci�n 7");
		                    break;
		                case 8:
		                    System.out.println("Has seleccionado la Opci�n 8");
		                    break;
		                case 9:
		                    System.out.println("Has seleccionado la Opci�n 9");
		                    break;
		                case 10:
		                    System.out.println("Saliendo del programa...");
		                    break;
		                default:
		                    System.out.println("Opci�n inv�lida. Por favor, selecciona una opci�n v�lida.");
		                    break;
		            }
		            System.out.println();
		        } while (opcion != 10);
		        
		        scanner.close();
		    }
		

	}


