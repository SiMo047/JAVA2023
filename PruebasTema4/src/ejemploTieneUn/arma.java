package ejemploTieneUn;

public class arma {

	public String arma ; 
	public int potencia ;

	
	/*contructor */
	public arma(String arma, int potencia) {
		super();
		this.arma = arma;
		this.potencia = potencia;
	}



	/*get y set */
	
	public String getArma() {
		return arma;
	}


	public void setArma(String arma) {
		this.arma = arma;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}




	
	
	
	/*string */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("arma [arma=");
		builder.append(arma);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	} 
	
	
	
}
