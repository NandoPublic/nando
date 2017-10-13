package Ejecutar;

public class Libro {
	private String isbn; 
	private String titulo;
	private String autor;
	private int numpag;
	
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumpag() {
		return numpag;
	}
	public void setNumpag(int numpag) {
		this.numpag = numpag;
	}
	
	public String toString() {
		String mensaje= "El libro de titulo \""  + titulo+ "\" con ISBN " + isbn+ " Creado por el autor "+ autor+ " tiene "
				+ numpag+ " páginas";
		return mensaje;
		}
	
	
	public Libro(String isbn, String titulo,  String autor, int numpag) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor= autor;
		this.numpag=numpag;
	}
	
}


