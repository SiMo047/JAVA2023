package Ejercicios;

public class Ejercicio16 {

	static double PI = Math.PI;
	public static void main(String[] args) {
		
		
		double diametro=15.5 , altura=42.4 , area , volumen ,r  ; 
		
		
		diametro/=2;
		r=diametro ;
		
		
		
		area = 2*PI*r*(r+altura);
		
		volumen= PI *altura*r*r ; 
		
		
		
		System.out.println("Esto es el area " +area);
		System.out.println("Esto es el volumen del cilindro "+volumen);

	}

}
