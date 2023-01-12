package EjemploStatic;

public class coche {

	
	private String marca ; 
	private String matricula ;
	
	public static int numcoche =0; 
	
	/*constructor */
	public coche(String marca, String matricula) {
		super();
		this.marca = marca;
		this.matricula = matricula;
	}

/*get u set*/
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	} 
	
	
	
	
}
