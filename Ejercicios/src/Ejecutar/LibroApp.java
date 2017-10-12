package Ejecutar;

public class LibroApp {
//version 001
	public static void main(String[] args) {
		Libro libro1= new Libro("as123", "La casa vacia", "W.H Clock", 163);
		Libro libro2=new Libro("asd456", "Caida", "H.L Flórez", 150);
		Libro libro3= new Libro("asdf 789", "elevación", "Valen d. N", 222);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
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
