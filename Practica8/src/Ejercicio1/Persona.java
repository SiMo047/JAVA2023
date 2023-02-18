package Ejercicio1;

import java.util.Objects;

public class Persona {

	enum Sexo{M,H,O};
	
	private String nombre ="" ; 
	private int edad=0 ; 
	private String dni="" ; 
	private Sexo sexo= Sexo.H ;
	private int peso =0; 
	private int altura=0 ;
	
	
	
	
	

	/*constructores*/

	public Persona(String nombre, int edad, String dni, Sexo sexo ,int peso, int altura ) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;

	}
	
	public Persona() {
		super();
		this.nombre = "Jose";
		this.edad = 21;
		this.dni = "75121957L";
		this.sexo = Sexo.H;
		this.peso=80 ; 
		this.altura= 180 ; 
	}


	public Persona(String nombre, int edad, String dni, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso=80 ; 
		this.altura= 180 ; 
	}



	
	public Persona(Persona otra) {
		super();
		this.nombre = otra.nombre;
		this.edad = otra.edad;
		this.dni = otra.dni;
		this.sexo = otra.sexo;
		this.peso=otra.peso ; 
		this.altura=otra.altura ; 
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

	
	/* to string */

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

/*equals*/
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
