package Ejercicio1;

import java.util.Objects;

public class Persona {

	enum Sexo{M,H,O };
	
	private String nombre ; 
	private int edad ; 
	private String dni ; 
	private int peso ; 
	private int altura ;
	private Sexo sexo ;
	
	
	
	

	/*constructores*/
	
	
	public Persona() {
		super();
	}


	public Persona(String nombre, int edad, String dni, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso=0 ; 
		this.altura= 0 ; 
	}


	public Persona(String nombre, int edad, String dni, int peso, int altura, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}


	/*metodos */
	
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


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	} 
	
	
	
	public boolean esMayordeEdad () {
		if (this.edad>=18) {
			return true ; 
		}
		return false ; 
	}
	
	
	public int calcularIMC() {
		int imc = this.peso/(int)(Math.pow(altura, 2));
		
		
		if (imc<20) {
			return 1;
		}else if (imc>=20||imc<=25) {
			return 0; 
		}else if (imc>25) {
			return -1 ; 
		}
		return 0 ; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
