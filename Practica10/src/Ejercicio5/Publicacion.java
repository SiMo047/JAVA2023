package Ejercicio5;

import java.util.Objects;

public class Publicacion {

	protected  String isbn ;
	protected String titulo ; 
	protected int ano ; 
	protected int paginas ;
	
	
	/*constructor*/
	public Publicacion(String isbn, String titulo, int ano, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		this.paginas = paginas;
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
	
	
	
	
	
	
	
}
