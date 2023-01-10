package ejemplo1;

public class bicicleta {

	/*propiedades : electricas (booleano ) , frenos , cambio , orquilla , material , precio */
	
	
	public boolean eselectrica;
	public String marca ; 
	public String frenos ;
	public String cambio ;
	public String orquilla ;
	public String material ;
	public double  precio ;
	

	
	
	/* contructor (sirve para crear luego objetos ) de las propiedades ya definidas anteriormente */
	
	public bicicleta(boolean eselectrica, String marca, String frenos, String cambio, String orquilla, String material, double precio) {
		super();
		this.eselectrica = eselectrica;
		this.marca = marca;
		this.frenos = frenos;
		this.cambio = cambio;
		this.orquilla = orquilla;
		this.material = material;
		this.precio = precio;
	}
	
	/*este contructor funcionaria sin argumentos (.....), y se podrian aplicar valores por defecto */
	public bicicleta () {
		super();
		this.eselectrica= false ; 
		this.marca ="no tiene marca "; 
		this.precio = 2500; 
		this.material = "Aluminio "; 
		
		}
	
	
	/*METODOS / COMPORTAMIENTOS */
	
	/*Si la bici es electrica se le aplica un 15% descuento sino un 5% */
	
	public double precioCondescuento() {
		double precioDescuento=0 ; 
		
		if (this.eselectrica==true) {
			precioDescuento = this.precio * 0.85;
		}else {
			precioDescuento = this.precio * 0.95 ; 
		}
		
		return precioDescuento;
	}

	
	
}
