package Ejercicio1;

import java.util.Scanner;

import Ejercicio1.Persona.Sexo;

public class test {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in); 
		
	
		
		System.out.println("Calculo de IMC");
		System.out.println("Introudce los siguientes datos  ");
	
		System.out.println("Nombre");
		String nom = sc.next();
		System.out.println("Edad");
		int edad = sc.nextInt(); 
		System.out.println("DNI");
		String dni= sc.next(); 
		System.out.println("Sexo (H=hombre) (M=mujer) (O=otro)");
		String sexo = sc.next(); 
		System.out.println("Peso");
		int peso = sc.nextInt();
		System.out.println("Altura");
		int altura = sc.nextInt(); 
		
		/* como la varieble Sexo en nuestra clase es un enum , al introducir nuestro sexo luego no nos deja ponerlo como parametro en el objeto 
		 * asi que creamos otra varible llamada en este caso (sx) y utilizamos el valueOf para recoger ese valor
		 */
	Sexo sx =Sexo.valueOf(sexo);
		
		Persona p1 = new Persona (nom,edad,dni,sx,peso,altura); 
		Persona p2 = new Persona ("Celia",17,dni,Sexo.M,90,175); 
		
		
		System.out.println(p1);
		
		if(p1.esMayordeEdad()==true) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad ");
		}
		
		if (p1.calcularIMC()==1) {
			System.out.println("Estas en tu peso ideal ");
		}else if (p1.calcularIMC()==0) {
			System.out.println("Estas por debajo de tu peso ideal");
		}else if (p1.calcularIMC()<0) {
			System.out.println("Tienes sobrepeso");
		}
	
		
		System.out.println(p1.equals(p2));
		
		
		
	}

}
