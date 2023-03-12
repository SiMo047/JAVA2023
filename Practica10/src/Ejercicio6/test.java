package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(5,4,3);
		Escaleno es1 = new Escaleno (7,12,10); 
		Equilatero eq1 = new Equilatero (5,5,5); 
		Isoceles is1 = new Isoceles (5,5,3); 
		
		System.out.println(r1.area());
		System.out.println(es1.area());
		System.out.println(eq1.area());
		System.out.println(is1.area());

		
		ArrayList<Triangulo> triangulos = new ArrayList<>();
		
		triangulos.add(r1); 
		triangulos.add(es1); 
		triangulos.add(eq1); 
		triangulos.add(is1);
		
		System.out.println(triangulos);
		
		Collections.sort(triangulos);
		
		System.out.println(triangulos);

	}

}
