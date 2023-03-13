package TiendaDeportes;

public class Ropa extends Producto {

	enum Talla{XS, S, M, L, XL, XLL};
	enum Tipo {CAMISETA,SUDADERA,VAQUEROS,CHAQUETA};
	
	
	private String color ; 
	private Talla talla;
	private Tipo tipo ;
	
	
	
	/*constructores */
	public Ropa() {
		super();
			this.color ="Rojo"; 
			this.talla = talla.M;
			this.tipo  = tipo.CHAQUETA;
	}
	
	public Ropa(String nombre, String descripcion, double precio, int unidadesStock ,String color , Talla talla , Tipo tipo) {
		super(nombre, descripcion, precio, unidadesStock);
		this.color = color; 
		this.talla = talla;
		this.tipo  = tipo;
		
	} 
	
	
	public Ropa(Ropa otro) {
		super(otro);
		this.color = otro.color; 
		this.talla = otro.talla;
		this.tipo  = otro.tipo;
		
	
	}

	/* get y set */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	/*toString*/
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ropa [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append(", color=");
		builder.append(color);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double descuento() {
		
		double descuento=0 ; 
		
		if (this.talla == talla.XS ||this.talla == talla.XLL ) {
			descuento=0.05;
		}else {
			descuento = 0.03;
		}
		
		
		return (1-descuento);
	}

	
	
	
	
	
	
	
	
	
	
}
