package PracticaClase;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Pedido {

	private static long cont =0; 
	
	enum Estado {RECIBIDO , PROCESADO , ENVIADO }; 
	
	
	private Long id ; 
	private LocalDate fechaEnvio ;
	private Estado estado; 
	private  Cliente cliente ; 
	private Set<Producto>productos ;
	
	
	
	public Pedido( LocalDate fechaEnvio, Estado estado, Cliente cliente) {
		super();
		this.id = ++cont;
		this.fechaEnvio = fechaEnvio;
		this.estado = estado;
		this.cliente = cliente;
		this.productos= new TreeSet <>();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public LocalDate getFechaEnvio() {
		return fechaEnvio;
	}



	public void setFechaEnvio(LocalDate fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Set<Producto> getProductos() {
		return productos;
	}
	
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [id=");
		builder.append(id);
		builder.append(", fechaEnvio=");
		builder.append(fechaEnvio);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	public void addProducto (Producto p ) {
		this.productos.add(p);
	}

	
	public void delProducto (Producto p) {
		this.productos.remove(p);
	}
	
	
	
}
