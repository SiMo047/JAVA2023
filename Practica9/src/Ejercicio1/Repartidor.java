package Ejercicio1;

public class Repartidor extends Empleados {


	private String zona ; 
	
	
	/*constructor*/
	public Repartidor(String nombre, int edad, double salario , String zona ) {
		super(nombre, edad, salario);
	this.zona = zona ; 
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
		if (this.edad<25 && this.zona=="zona3") {
			this.salario= this.salario+this.plus; 
			return true ; 
		}else 
			return false; 
		
	}
	
}
