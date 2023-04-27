package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio1 {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG", "In", "THE", "Street");
		
		/*Crea una nueva lista con todos los strings en min�scula y mu�stralos despu�s con System.out.*/
		
		List<String> lista2 =lista.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
	System.out.println(lista2);
	
	/*Haz lo mismo, pero s�lo con los strings que tengan m�s de tres caracteres.*/
		List <String> lista3 = lista.stream()
				.filter(s-> s.length()>3)
				.map(String :: toLowerCase)
				.collect(Collectors.toList());
		
		System.out.println(lista3);
		
	/*Haz lo mismo que el anterior, a partir de ese resultado a�ade que salte los dos primeros strings, y devuelve s�lo tres strings del resultado.*/
		
		List <String>lista4=lista3.stream()
		.skip(2)
		.limit(3)
		.collect(Collectors.toList());
		
		System.out.println(lista4);
		
	/*Toma la lista y directamente impr�mela ordenada.*/
		
		List<String>lista5 = lista4.stream()
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(lista5);
		
	
	/*Cuenta cu�ntos strings tienes m�s de 4 caracteres.*/
		Integer num = (int) lista.stream()
				.filter(s-> s.length()>4)
				.count();
		
				
				System.out.println(num);
		
	/*Usando una reducci�n devuelve una cadena uniendo todas las cadenas separadas por un �-�.*/			
				
	/*Devuelve la primera cadena que cumpla que contiene (contains) la �O�. (Usar filter con un Predicate).*/
				
		String cadena = lista.stream()
				.filter(s-> s.contains("O"))
				.findFirst()
				.get();
		
		System.out.println(cadena);
		
	}

}

