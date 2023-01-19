package ejercicio8;

public class incidencia {

	

	private String codigo;
	private String estado;
	private String problema;
	private String solucion;
	
	public static int pendientes = 0;

	public incidencia(String problema, String solucion) {
		super();
		this.estado = "Abierta";
		this.problema = problema;
		this.solucion = solucion;
		this.codigo = generarCodigo();
		
		/*asi conseguimos que la variable estatica aumente cada vez que se crea un objeto*/
		
		incidencia.pendientes++;
	}
	
	
	private String generarCodigo() {
		
		StringBuilder co = new StringBuilder();
		co.append("inc");
		for(int i=0; i<5; i++) {
			co.append( (int) (Math.random()*10) );
		}
		
		return co.toString();
	}

/*get y set */
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	
	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getProblema() {
		return problema;
	}


	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}


	
	public void resuelve(String solucion) {
		if (this.estado != "Resuelta") {
			this.estado = "Resuelta";
			this.solucion = solucion;
			incidencia.pendientes--;
		}
	}
	
	public static int getPendiente() {
		return incidencia.pendientes;
	}
	
	
	/*to string */

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incidencia [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}
	
}
