package Ejecutar;

public class Casa {
	private double superficie;
	private String direccion;
	private SalonCasa saloncasa;
	private CocinaCasa cocina;
	private HabitacionesCasa habitacionescasa;


	public HabitacionesCasa getHabitacionescasa() {
		return habitacionescasa;
	}

	public void setHabitacionescasa(HabitacionesCasa habitacionescasa) {
		this.habitacionescasa = habitacionescasa;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public SalonCasa getSaloncasa() {
		return saloncasa;
	}

	public void setSaloncasa(SalonCasa saloncasa) {
		this.saloncasa = saloncasa;
	}

	public CocinaCasa getCocina() {
		return cocina;
	}

	public void setCocina(CocinaCasa cocina) {
		this.cocina = cocina;
	}

	public Casa() {
		this.superficie = 1000;
		this.direccion = "desconocida";
		this.saloncasa = new SalonCasa();
		this.cocina = new CocinaCasa();
		this.habitacionescasa= new HabitacionesCasa();
	}

}