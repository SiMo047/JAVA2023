package Ejercicio1;

public class Comercial extends Empleados {

	

	private double comision ; 
	
	
	/*constructor */
	
	public Comercial(String nombre, int edad, double salario , double comision ) {
		super(nombre, edad, salario);
		this.comision=comision;
	}

	/*get y set */

	public double getComision() {
		return comision;
	}


	public void setComision(double comision) {
		this.comision = comision;
	}

	
	/*metodo plus --> que segun la condiciones se le aplica el plus de 300euros */
	
	public boolean pluss() {
		if (this.edad >30 && this.comision>200) {
			this.salario= this.salario+this.plus; 
			return true ; 
		}else {
			return false; 
		}
		
		
	}





}
