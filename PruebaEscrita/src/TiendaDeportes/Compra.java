package TiendaDeportes;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Compra implements Enviable {

	private ArrayList<LineaCompra>lineacompra; 
	private LocalDateTime fecha ; 
	private double precioTotal ; 
	
	
	/*constructor */
	
	public Compra(LocalDateTime fecha) {
		super();
		this.fecha = fecha;
		this.lineacompra=new ArrayList<>();
		this.precioTotal=0; 
	}

	/*get y set */
		
	public ArrayList<LineaCompra> getLineacompra() {
		return lineacompra;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compra [lineacompra=");
		builder.append(lineacompra);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", precioTotal=");
		builder.append(precioTotal);
		builder.append("]");
		return builder.toString();
	}

	/*metodo que añade una linea de compra ,si ya existe entonces incrementaria 
	 * la cantidad  
	 */
	public void addLinea(LineaCompra lc) {
		
		int posicion = this.lineacompra.indexOf(lc); 
		
		if (posicion>=0) {
			
			
			LineaCompra lc2 = this.lineacompra.get(posicion);
			
			lc2.setCantidad(lc.getCantidad()+lc2.getCantidad());
			/*aqui sumamos el subtotal al precio total de la compra */
			this.precioTotal+=lc2.subtotal();
			
			
		}else {
			this.lineacompra.add(lc);
		}
	}
	
	/*metodo que borra la linea de compra del array */
	public void delLinea (LineaCompra lc ) {
		
		int posicion = this.lineacompra.indexOf(lc);
		
		if(posicion>=0) {
			
			/*aqui restamos el subtotal al precio total de la compra */
			this.precioTotal-=lc.subtotal();
			
			this.lineacompra.remove(posicion); 
		}
			
	}
	
	
	public String crearEmaill(){
		
	  final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		SecureRandom random = new SecureRandom();
		for (int i=0 ; i<8; i++) {
			 
			int letra = random.nextInt(chars.length());
			sb.append(chars.charAt(letra)+"@gmail.com");
		}
		
		sb.append("\n");
		for(LineaCompra lc : this.lineacompra) {
			sb.append(lc);
			sb.append("\n");
		}
		
		return sb.toString();
	}	
	
	
	@Override
	public String crearEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
