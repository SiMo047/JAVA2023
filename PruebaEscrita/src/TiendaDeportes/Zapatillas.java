package TiendaDeportes;

public class Zapatillas extends Producto {

	enum Numero{n35,n36,n37,n38,n39,n40,n41,n42,n43,n44,n45,n46,n47,n48,n49,n50};
	enum Categoria {running, walking, fútbol, gimnasio, chanclas, trail, baloncesto, golf};
	
	
	private Categoria categoria ; 
	private Numero numero ;
	 
	
	/*constructores */
	
	public Zapatillas() {
		super();
		this.categoria=categoria .baloncesto; 
		this.numero = numero.n42;
		
	}
	public Zapatillas(Zapatillas otro) {
		super(otro);
		
		this.categoria=otro.categoria ;
		this.numero=otro.numero; 
		
		
	}
	public Zapatillas(String nombre, String descripcion, double precio, int unidadesStock , Categoria categoria , Numero numero ) {
		super(nombre, descripcion, precio, unidadesStock);
		
		this.categoria= categoria ; 
		this.numero= numero; 
		
	}
	
	/*get y set */
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zapatillas [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
	
	
	@Override
	public double descuento() {
	
		double descuento =0; 
		
		if (this.numero==this.numero.n35 ||this.numero==this.numero.n47||this.numero==this.numero.n48 ||
				this.numero==this.numero.n49 || this.numero==this.numero.n50) {
			descuento = 0.05; 
		}else {
			descuento = 0.03; 
		}
		
		return descuento ;
	}
	
	
	
	
	
	
	
	
}
