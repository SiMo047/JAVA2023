package Ejercicio2;

public class test {

	public static void main(String[] args) {

		ConversorFechas c1 = new ConversorFechas(); 
		
		String f1 = "12/08/2022";
		String f2 = "09/16/2023";
		System.out.println("Fecha Normal convertida a Americana "+c1.NormalToAmericano(f1));
		
		System.out.println("Fecha Americana convertida a Normal "+c1.AmericanoToNormal(f2));
		; 
	}

}
