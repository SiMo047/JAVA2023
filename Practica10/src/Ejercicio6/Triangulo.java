package Ejercicio6;

import java.util.Objects;

/*clase es abstract , quiere decir que tiene metodos que son abtractos y devolvera diferentes resultados en las clases hijas 
 * y la clase tambien implementa la clase Comparable de java 
 */
public abstract class Triangulo implements Comparable<Triangulo>{

	
	protected double lado1 ; 
	protected double lado2 ; 
	protected double lado3 ;
	
	/*constructores*/
	
	public Triangulo() {
		super();
	}



	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		
		if (!this.validar()) throw new IllegalArgumentException("Error, los valores de estos lados no se corresponden con este tipo de triángulo");
		
	} 
	

	public Triangulo(Triangulo otro ) {
		super();
		this.lado1 = otro.lado1;
		this.lado2 = otro.lado2;
		this.lado3 = otro.lado3;
	}

	
	/*get y set */


	public double getLado1() {
		return lado1;
	}



	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}



	public double getLado2() {
		return lado2;
	}



	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}



	public double getLado3() {
		return lado3;
	}



	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


/*equals */
	@Override
	public int hashCode() {
		return Objects.hash(lado1, lado2, lado3);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		return Double.doubleToLongBits(lado1) == Double.doubleToLongBits(other.lado1)
				&& Double.doubleToLongBits(lado2) == Double.doubleToLongBits(other.lado2)
				&& Double.doubleToLongBits(lado3) == Double.doubleToLongBits(other.lado3);
	}

/*metodo Comparable (implements)*/

	@Override
	public int compareTo(Triangulo o) {
		
		if (this.area()<o.area()) {
			return -1 ; 
			}
		if (this.area()>o.area()) {
			return 1;
		}
		
		return 0;
	} 

/*metodo que calcula el perimetro de un triangulo */
	public double perimetro () {
		return this.lado1+this.lado2+this.lado3; 
	}
	

	/*metodo que calcula el area , sera abstract ya que en cada clase hija se calculara
	 * de distinta manera , entonces se implementara despues el codigo en las clases hijas  */
	
	public abstract double area();
	
	/*metodo validoi que validara el tipo de tringulo tambien sera abstract
	 * se implementara el codigo en las clases hijas */
	
	public abstract boolean validar();



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo [lado1=");
		builder.append(lado1);
		builder.append(", lado2=");
		builder.append(lado2);
		builder.append(", lado3=");
		builder.append(lado3);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	 
	

	
	
	
	
}
