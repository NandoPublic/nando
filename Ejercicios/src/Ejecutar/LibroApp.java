package Ejecutar;

public class LibroApp {

	public static void main(String[] args) {
		Libro libro1= new Libro("as123", "La casa vacia", "W.H Clock", 163);
		Libro libro2=new Libro("asd456", "Caida", "H.L Flórez", 150);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
			if (libro1.getNumpag()<libro2.getNumpag()) {
				System.out.println("el libro \""+ libro1.getTitulo()+ "\" tiene más páginas que el libro "
						+ libro2.getTitulo());
			} else {
				System.out.println("el libro \""+ libro2.getTitulo()+ "\" tiene más páginas que el libro \""
						+ libro1.getTitulo()+"\"");
			}
		
	}

}
