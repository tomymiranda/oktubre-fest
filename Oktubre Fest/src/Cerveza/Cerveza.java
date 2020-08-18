package Cerveza;

public abstract class Cerveza {

	private int cantidadDeLupus;
	
	private String paisDeOrigen;
	
	private double porcentajeDeAlcohol = 0.08;
	
	private String marca;
	
	public Cerveza(String pais, int cantidadDeLupus, String marca){
		
		this.cantidadDeLupus = cantidadDeLupus;
		this.paisDeOrigen = pais;
		this.marca=marca;
	}

	public int getCantidadDeLupus() {
		return cantidadDeLupus;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}


	public double getPorcentajeDeAlcohol() {
		return porcentajeDeAlcohol;
	}

	 

	public void setPorcentajeDeAlcohol(double porcentajeDeAlcohol) {
		this.porcentajeDeAlcohol = porcentajeDeAlcohol;
	}

	public String getMarca() {
		return marca;
	}
	
}
