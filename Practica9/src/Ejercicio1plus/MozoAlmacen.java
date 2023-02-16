package Ejercicio1plus;

public class MozoAlmacen extends Operario {


	private int peligrosidad ; 
	
	
	public MozoAlmacen(String nombre, int edad, double salario, int Hextra , int peligrosidad) {
		super(nombre, edad, salario, Hextra);
		
		this.peligrosidad = peligrosidad ; 
	}

	
	

	public boolean pluss() {
		if (peligrosidad==3 || (peligrosidad==2 && this.edad>30) || (peligrosidad==1 && this.edad<30)) {
			this.salario= this.salario+this.plus; 
			return true ; 
		}else 
			return false; 
		
	}
	
	
}
