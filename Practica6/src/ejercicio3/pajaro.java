package ejercicio3;

public class pajaro {

	/*es recomendable poner de primero las prpiedades de la clase en este caso son edad y color */
	
	private int edad ; 
	private char color ;

	
	
	/*despues de esto hay que crear un constructor */
	
	public pajaro(int edad, char color) {
		super();
		this.edad = edad;
		this.color = color;
	} 
	
	public pajaro() {
		super();
		this.edad = 2;
		this.color = 'a'; 
	}


	
	/*despues implementamos los metodos ( get , set , etc ) */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setColor(char color) {
		this.color = color;
	} 
	
	
	public void printedad() {
		System.out.println(this.edad);
	}


	
/*tostring para ver el estado del obj*/
	
	@Override
	public String toString() {
		return "pajaro [edad=" + edad + ", color=" + color + "]";
	}
	
}
