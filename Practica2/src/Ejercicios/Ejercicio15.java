package Ejercicios;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int cantidad =2000 ; 
		double intereses = 2.75/100; 
		double retencion= 18.0/100 ; 
		
		double miinteres , miretencion ; 
		
		
		miinteres = 2000 * intereses / 2 ; 
		miretencion = miinteres * retencion ; 
		
		

		System.out.println(miinteres + " $ sin retención");
		System.out.println("Lo que se queda hacienda es " + miretencion);
		System.out.println("Beneficio total  " + (miinteres - miretencion) + " $ ");

	}

}
