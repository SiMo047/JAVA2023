package application;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {

		
		

	
		
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        do {
		            System.out.println("Menú:");
		            System.out.println("1. Opción 1");
		            System.out.println("2. Opción 2");
		            System.out.println("3. Opción 3");
		            System.out.println("4. Opción 4");
		            System.out.println("5. Opción 5");
		            System.out.println("6. Opción 6");
		            System.out.println("7. Opción 7");
		            System.out.println("8. Opción 8");
		            System.out.println("9. Opción 9");
		            System.out.println("10. Salir");
		            System.out.print("Ingrese una opción: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    System.out.println("Has seleccionado la Opción 1");
		                    break;
		                case 2:
		                    System.out.println("Has seleccionado la Opción 2");
		                    break;
		                case 3:
		                    System.out.println("Has seleccionado la Opción 3");
		                    break;
		                case 4:
		                    System.out.println("Has seleccionado la Opción 4");
		                    break;
		                case 5:
		                    System.out.println("Has seleccionado la Opción 5");
		                    break;
		                case 6:
		                    System.out.println("Has seleccionado la Opción 6");
		                    break;
		                case 7:
		                    System.out.println("Has seleccionado la Opción 7");
		                    break;
		                case 8:
		                    System.out.println("Has seleccionado la Opción 8");
		                    break;
		                case 9:
		                    System.out.println("Has seleccionado la Opción 9");
		                    break;
		                case 10:
		                    System.out.println("Saliendo del programa...");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
		                    break;
		            }
		            System.out.println();
		        } while (opcion != 10);
		        
		        scanner.close();
		    }
		

	}


