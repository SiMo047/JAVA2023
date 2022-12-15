package primeraevaluacion;
import java.util.Arrays;
public class Ejercicio3 {
	
	/*pintar vector */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
	}
	/*rellenar array con un num que se le pasa */
	public static void rellenar (int array[], int num) {
		
		for ( int i=0 ; i<array.length;i++) {
			array[i]=num;
			System.out.print(array[i]+ " ");
		}
		
	}
	/*ordenar un array con el metodo burbuja */
	public static void ordenar(int array[]) {
		
		int aux;
		
		for (int i=array.length; i > 0; i--) {
			for (int j=0; j < i-1; j++) {
				if (array[j] > array[j+1]) {
					//Intercambiar
					aux = array[j+1];
					array[j+1] = array[j];
					array[j] = aux;
				}
			}
			
		}
		
	}
	
	public static void pintar (int array[]) {
		
		for ( int i=0 ; i<array.length;i++) {
			String st=String.valueOf(array[i]);
			System.out.print(st+ " ");
		}
		
	}

	public static void main(String[] args) {

		/*a*/
		int[] array= new int [50]; 
	/*b*/	
	Arrays.fill(array, 100);
	

	/*c*/
 System.out.println(Arrays.toString(array));
 /*d*/
	for(int i=0; i<array.length; i++) {
		Arrays.sort(array);
	}
	/*e*/
	System.out.println(Arrays.toString(array));
	
	
	/*f*/
	int copia[]=Arrays.copyOf(array, array.length);
	/*g*/
	System.out.println(Arrays.toString(copia));
	
	System.out.println();
	
	
	
	}
	
	
}
