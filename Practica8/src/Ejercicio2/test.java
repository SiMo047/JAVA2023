package Ejercicio2;

public class test {

	public static void main(String[] args) {


		Password contra1 = new Password(12);
		Password contra2 = new Password();
		
	System.out.println(contra1);
	System.out.println(contra2);
	System.out.println();
	System.out.println(contra1.esFuerte());
	System.out.println(contra2.esFuerte());
	
 
	}

}
