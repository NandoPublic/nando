package Ejecutar;

public class LibroApp {
//version 001
	public static void main(String[] args) {
		Libro libro1= new Libro("as123", "La casa vacia", "W.H Clock", 163);
		Libro libro2=new Libro("asd456", "Caida", "H.L Flórez", 150);
		Libro libro3= new Libro("asdf 789", "elevación", "Valen d. N", 222);
		Libro libro4= new Libro ("asdf 321", "Antes", "NR", 100);

		Libro libro5= new Libro ("asdf 321", "Sublevacion", "", 100);

		Libro libro6= new Libro ("asdf 421", "Arcángel", "N-L", 100);
		Libro libro7= new Libro ("XXXX 421", "Error Y Sufrimiento", "N-L", 100);
		

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		System.out.println(libro4.toString());
		
		System.out.println("El autor de libro: "+ libro1.getTitulo()+ " es: "+ libro1.getAutor());
		
			if (libro1.getNumpag()<libro2.getNumpag()) {
				System.out.println("el libro \""+ libro1.getTitulo()+ "\" tiene más páginas que el libro "
						+ libro2.getTitulo());
			} else {
				System.out.println("el libro \""+ libro2.getTitulo()+ "\" tiene más páginas que el libro \""
						+ libro1.getTitulo()+"\"");
			}
		
	}

}
