package Ejercicio2;

import java.util.Objects;
import java.util.TreeSet;

public class Publicacion implements Comparable<Publicacion> , Prestable {

	protected  String isbn ;
	protected String titulo ; 
	protected int ano ; 
	protected int paginas ;
	protected boolean prestado ; 
	protected TreeSet<Autor>autores ;
	
	
	/*constructor*/
	public Publicacion(String isbn, String titulo, int ano, int paginas, boolean prestado) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		this.paginas = paginas;
		this.prestado = prestado ; 
		this.autores= new TreeSet <>();
	}


/*get y set*/
	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public int getPaginas() {
		return paginas;
	}



	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


/*toString */
	
	@Override
	public String toString() {
		return "Publicacion [isbn=" + isbn + ", titulo=" + titulo + ", ano=" + ano + ", paginas=" + paginas + "]";
	}

/*equals*/

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}



/*------implementamos comparable -----------*/

	@Override
	public int compareTo(Publicacion o) {
		
		return this.titulo.compareTo(o.titulo);
	} 
	
	
	/* intefaz comparable */
	@Override
	public void presta() {
		
		this.prestado=true ;

	}

	@Override
	public void devuelve() {
		this.prestado=false ;

	}

	@Override
	public void estaPrestado() {
		
		this.prestado=true ; 

	}
	
	
	public void addAutor (Autor a) {
		if (this.autores.contains(a)==false) {
			this.autores.add(a);
		}
	}
	
	public void deleteAutor ( Autor a ) {
		
		this.autores.remove(a);
		
	}
	
	public String getAutores () {
	
		StringBuffer sb = new StringBuffer ();
		
		for (Autor a : this.autores) {
			sb.append(a);
			sb.append("\n"); 
		}
		
		return sb.toString();
			
		}
	


}
	
	
	

