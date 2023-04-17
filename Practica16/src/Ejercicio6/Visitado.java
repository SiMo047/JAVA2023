package Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Visitado {

	
	private HashMap <String , List<String>> paises ; 
	
	
	
	 public Visitado( ) {
	        this.paises = new HashMap<>();
	    }
	 
	 
	 
	 public void addPais(String nomPais) {
		 /*comprobamos que la clave no este  */
		 if (!paises.containsKey(nomPais)) {
			paises.put(nomPais, new ArrayList<>()); 
		 }
	 }
	 
	 
	 public void addCiudad (String pais , String ciudad) {
		 
		 /*comprobamos que la clave este */
		 if (paises.containsKey(pais)) {
			 
		 }
		 
	 }
	 
}
