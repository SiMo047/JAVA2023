package Ejercicio7;

import java.util.Scanner;

public class test {
	
	public static Integer stringToInteger(String str) {
	    return Integer.valueOf(str);
	}

	public static void main(String[] args) {

		
		/*Scanner sc = new Scanner (System.in);
		
		int opt=0 ; 
		
		System.out.println("MENU--AGENDA");
		System.out.println("------------");
		
		System.out.println("Seleccione Una Opcion");
		
		System.out.println("1.Añadir nuevo contacto");
		System.out.println("2.Listar contactos");
		System.out.println("3.Buscar contacto");
		System.out.println("4.Eliminar contacto");
		System.out.println("5.Estado de la agenda");
		System.out.println("6.Salir");
		
	*/
	
		
		Agenda ag1 = new Agenda ();
		
		Contacto c1 = new Contacto (); 
		Contacto c2 = new Contacto ("Jose",635121314); 
		Contacto c3 = new Contacto ("Rafa",635155314); 
		Contacto c4 = new Contacto ("Celia",63214778);
		Contacto c5 = new Contacto ("Jose Empresa",950121230);
		
	 
		
		
		 
		ag1.addContacto(c1);
		ag1.addContacto(c2);
		ag1.addContacto(c3);
		ag1.addContacto(c4);
		ag1.addContacto(c5);
		
		
		System.out.println(ag1.listarContactos());
		
		System.out.println(ag1.buscarContacto("Jose"));
		
		System.out.println(ag1.existeContacto(c5));
		
		
		System.out.println(ag1.eliminarContacto(c5));
		System.out.println(ag1.listarContactos());
		 
		
		
	}

}
