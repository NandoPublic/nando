package Ejecutar;

public class CasaApp {
//se prepara para commit 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casa casa1=new Casa();
		System.out.println(casa1.getDireccion()+ " "+ casa1.getSuperficie()+ " "+ casa1.getCocina()
		 + " " + casa1.getHabitacionescasa());
		
		Casa casa2= new Casa();
		System.out.println(casa1.getSuperficie()+ " mts cuadrados "+ casa2.getCocina()+ casa2.getHabitacionescasa());
		
		System.out.println(casa2.getDireccion());
		
	}

}
