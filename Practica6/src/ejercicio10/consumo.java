package ejercicio10;

public class consumo {

	private double kms; 
	private double litros ; 
	private double vmed ; 
	private double preciogasolina ;

	
	
	/*construc*/
	
	public consumo(double kms, double litros, double vmed, double preciogasolina) {
		super();
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.preciogasolina = preciogasolina;
	}

	/*get y set*/


	public double getKms() {
		return kms;
	}



	public void setKms(double kms) {
		this.kms = kms;
	}



	public double getLitros() {
		return litros;
	}



	public void setLitros(double litros) {
		this.litros = litros;
	}



	public double getVmed() {
		return vmed;
	}



	public void setVmed(double vmed) {
		this.vmed = vmed;
	}



	public double getPreciogasolina() {
		return preciogasolina;
	}



	public void setPreciogasolina(double preciogasolina) {
		this.preciogasolina = preciogasolina;
	} 
	/*----------------*/
	
	
	public double getTiempo () {
		double tiempo ; 
		tiempo = this.kms/this.vmed; 
		
		return tiempo ; 
	}
	
	public double consumoMedio () {
		double l ; 
		l = (this.litros*100)/this.kms; 
		return l ; 
	}
	
	public double consumoEuros () {
	double eu;
	
	eu= this.preciogasolina * this.consumoMedio();
	return eu; 
	}
	
	
}
