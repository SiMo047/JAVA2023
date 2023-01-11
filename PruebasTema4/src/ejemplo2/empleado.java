package ejemplo2;

public class empleado {

/*propiedades de la clase en private*/ 

	private String nombre; 
	private String apellido;
	private int edad ; 
	private String email ; 
	private double salariomensualbruto  ; 
	private double irpf  ; 
	private double ssc ; 
	private String departamento ;
	
	
	/*contructores */
	
	
	public empleado(String nombre, String apellido, int edad, String email, double salariomensualbruto, double irpf,
			double ssc, String departamento) {
		
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.salariomensualbruto = salariomensualbruto;
		this.irpf = irpf;
		this.ssc = ssc;
		this.departamento = departamento;
		
}
	/* contructor por defecto */
	public empleado() {
		 super();
			
		 this.nombre = "";
			this.apellido = "";
			this.edad = 0;
			this.email = "";
			this.salariomensualbruto = 2500;
			this.irpf = 0.19;
			this.ssc = 0.05;
			this.departamento = "";
		 
	}
	
	/*get y set */
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalariomensualbruto() {
		return salariomensualbruto;
	}
	public void setSalariomensualbruto(double salariomensualbruto) {
		this.salariomensualbruto = salariomensualbruto;
	}
	public double getIrpf() {
		return irpf;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	public double getSsc() {
		return ssc;
	}
	public void setSsc(double ssc) {
		this.ssc = ssc;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	/*metodo / comportamiento */
	
	public double mostrarSalarioActual() {
		double salario=0 ;
		double descuento=0 ; 
		descuento = (this.getSalariomensualbruto()*this.getIrpf())+(this.getSalariomensualbruto()*this.getSsc());
		salario = this.getSalariomensualbruto()-descuento;
		
		return salario ; 
		
	}
	
	
	
	
	
	
	
	

}
