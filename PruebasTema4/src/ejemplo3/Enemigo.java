package ejemplo3;

public class Enemigo {

	/*propiedades */
	
	private String nombre; 
	private String tipo ; 
	private int salud ; 
	private int nivel ; 
	private int damage ;

	/*propiedad estatica que es comun para todos los objetos */
	public static int numenemigos=0; 
	
	
	/*contructores */
	
	public Enemigo(String nombre, String tipo , int damage) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.salud = 100;
		this.nivel = 1;
		this.damage = damage;
		/*se suma el 1 cuando se crea un objeto (es como un contador de objetos )*/
		numenemigos++;
	} 
	
	public Enemigo() {
		super();
		this.nombre = "";
		this.tipo = "";
		this.salud = 0;
		this.nivel = 0;
		this.damage = 0;
	}

	
	/*get y set */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	} 
	
	
	public void levelup() {
		this.nivel+=1;
		this.salud+=(int) Math.pow(2, this.nivel); 
	}
	
	public void recibirdamage(int damage ){
	
		this.salud= this.salud - damage ; 
		
		if (this.salud<=0) {
			System.out.println("GAME OVER - Has Muerto");
			/*aqui restamos el enemigo si muere con la propiedad estatica */
			numenemigos--;
		}
	}

	
	
	
	/* to String para mostrar luego los valores en tiempo real */
	
	  
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enemigo [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append(", damage=");
		builder.append(damage);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
