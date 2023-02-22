package Ejercicio7;

import java.util.Scanner;

public class test {
	
	public static Integer stringToInteger(String str) {
	    return Integer.valueOf(str);
	}

	public static void main(String[] args) {

		
		Agenda ag1 = new Agenda ();
		Scanner sc = new Scanner (System.in);
		
		int opt=0 ; 
		String nom ; 
		int num  ;	
		
		do {
		System.out.println("MENU--AGENDA");
		System.out.println("------------");
		
		System.out.println("Seleccione Una Opcion");
		
		System.out.println("1.Añadir nuevo contacto");
		System.out.println("2.Listar contactos");
		System.out.println("3.Buscar contacto");
		System.out.println("4.Eliminar contacto");
		System.out.println("5.Estado de la agenda");
		System.out.println("6.Salir");
		
		opt = sc.nextInt();
		
		
		switch (opt) {
		case 1: {
			
			System.out.println("Cuantos contactos quieres añadir ");
			int nuum=sc.nextInt();
			
			for (int i=1;i<=nuum;i++) {
				System.out.println("Introduce el nombre del "+i+"º contacto ");
				nom= sc.next();
				System.out.println("Introduce el numero del contacto ");
				num = sc.nextInt();

				Contacto c = new Contacto (nom,num);
				ag1.addContacto(c);
			}
			
		 break;
			}
		case 2:{
			System.out.println(ag1.listarContactos());
			break;
		}
		case 3:{
			System.out.println("Introduce el contaco a buscar");
			nom=sc.next();
			System.out.println(ag1.buscarContacto(nom));
			break;
		}
		case 4:{
			System.out.println("Introduce el nombre del contacto a eliminar");
			nom=sc.next();
			ag1.eliminarContacto(nom);
			break;
		}
		case 5:{
			System.out.println(ag1.listarContactos());
			break; 
		}
		case 6:{
			System.out.println("Cerrando Agenda");break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opt);
		}
	
		}while (opt<6);
	
		
	
		
		
	
		
		
		 
		
		
	}

}
