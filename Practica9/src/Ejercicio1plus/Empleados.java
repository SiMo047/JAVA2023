package Ejercicio1plus;


public class Empleados{

	
	protected  String nombre ; 
	protected int edad ; 
	protected double salario ; 
	protected static int plus = 300;
	
	
	
	/*constructor*/
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

/*get y set */

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	/*to String */
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleados [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	} 
}
	
	
	
	
	