package Ejercicios;

public class Ejercicio12 {

	
	public static String romano (int num) {
		
	
	   
		  
		  
		  int  miles, centenas, decenas, unidades;
	    
		  String romano = "";	    
		  //se obtiene cada cifra del número
		  
		  
		  miles = num / 1000;
	      centenas = num / 100 % 10;
	      decenas = num / 10 % 10;
	      unidades = num % 10;
	 
	     //millar (ragno de 1000 ) 
	      for (int i = 1; i <= miles; i++) {
	             romano = romano + "M";
	      }
	 
	     //centenas ( rango es de 100 hasta 900 ) 
	      if (centenas == 9) {
	          romano = romano + "CM";
	      } else if (centenas >= 5) {
	                     romano = romano + "D";
	                     for (int i = 6; i <= centenas; i++) {
	                            romano = romano + "C";
	                     }
	      } else if (centenas == 4) {
	                      romano = romano + "CD";
	      } else {
	                  for (int i = 1; i <= centenas; i++) {
	                         romano = romano + "C";
	                  }
	      }
	 
	     //decenas ( rango es de 10 hasta 90 ) 
	      if (decenas == 9) {
	           romano = romano + "XC";
	      } else if (decenas >= 5) {
	                      romano = romano + "L";
	                      for (int i = 6; i <= decenas; i++) {
	                            romano = romano + "X";
	                      }
	      } else if (decenas == 4) {
	                      romano = romano + "XL";
	      } else {
	                    for (int i = 1; i <= decenas; i++) {
	                           romano = romano + "X";
	                    }
	      }
	 
	     //unidades ( rango es de 1 hasta 9 ) 
	      if (unidades == 9) {
	           romano = romano + "IX";
	      } else if (unidades >= 5) {
	                      romano = romano + "V";
	                      for (int i = 6; i <= unidades; i++) {
	                             romano = romano + "I";
	                      }
	      } else if (unidades == 4) {
	                      romano = romano + "IV";
	      } else {
	                  for (int i = 1; i <= unidades; i++) {
	                         romano = romano + "I";
	                  }
	      }
			System.out.println(miles);
			System.out.println(centenas);
			System.out.println(decenas);
			System.out.println(unidades);
		return romano;
	 
	    }
	
	public static void main(String[] args) {
		
	
		System.out.println(romano(2445));
	}

}


