package Ejercicio1plus;

public class Repartidor extends Operario {



	private String zona ; 
	
	
	/*constructor*/
	
	public Repartidor(String nombre, int edad, double salario, String zona, int Hextra) {
		super(nombre, edad, salario, Hextra);
		this.zona= zona ; 
	}


/*get y set */

	public String getZona() {
		return zona;
	}



	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
	/*metodo plus --> que segun la condiciones se le aplica el plus de 300euros*/

	public boolean pluss() {
		if (this.edad<25 && this.zona=="zona3"&& this.horasExtra>0) {
			this.salario= this.salario+this.plus; 
			return true ; 
		}else 
			return false; 
		
	}
	
}
