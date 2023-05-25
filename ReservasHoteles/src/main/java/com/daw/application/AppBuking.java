package com.daw.application;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.daw.servicios.Buking;

import io.ReservaFile;

public class AppBuking {

	public static void main(String[] args) {
	

		Buking bk = ReservaFile.cargaCSV();
		
		
		
		
		 
		
		Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("MENU:");
	            System.out.println("1. Listar todos los hoteles");
	            System.out.println("2. Listar todas las reservas: que muestre dni, habitaciones, fecha entrada y salida e importe, de todas las reservas ordenadas por fecha de entrada.");
	            System.out.println("3. Mostrar reservas por pais: que imprima el numero de reservas agrupadas por pais.");
	            System.out.println("4. Mostrar reservas activas: pregunte hotel y salgan sus reservas “no finalizadas” ordenadas por fecha de salida.");
	            System.out.println("5. Mostrar importe reservas finalizadas este año: pregunte hotel y salga el importe de las reservas “finalizadas” este año.");
	            System.out.println("6. Insertar reserva: que pida todos los datos de una reserva y la inserte en BD.");
	            System.out.println("7. Eliminar reserva: que pida el id y elimine esa reserva de la BD.");
	            System.out.println("8. Salir: que grabe los datos de BD al fichero hoteles.csv y reservas.csv y termine el programa.");
	            System.out.print("Ingrese una opcion: ");
	           
	            
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Has seleccionado la Opcion 1");
	                    System.out.println(bk.listarHoteles());
	                    break;
	                case 2:
	                    System.out.println("Has seleccionado la Opcion 2");
	                    break;
	                case 3:
	                    System.out.println("Has seleccionado la Opcion 3");
	                   
	                    break;
	                case 4:
	                    System.out.println("Has seleccionado la Opcion 4");
	                    break;
	                case 5:
	                    System.out.println("Has seleccionado la Opcion 5");
	                    break;
	                case 6:
	                    System.out.println("Has seleccionado la Opcion 6");
	                    break;
	                case 7:
	                    System.out.println("Has seleccionado la Opcion 7");
	                    break;
	                case 8:
	                    System.out.println("SALIR");
	                    break;
	           
	                default:
	                    System.out.println("Opcion invalida");
	                    break;
	            }
	            System.out.println();
	        } while (opcion != 8);
	        
	      
	
	
	}

}
