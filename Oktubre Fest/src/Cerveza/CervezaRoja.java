package Cerveza;

public class CervezaRoja extends Cerveza {

	public CervezaRoja(String pais, int cantidadDeLupus) {
		super(pais, cantidadDeLupus,"roja");
		// TODO Apéndice de constructor generado automáticamente
	
	 setPorcentajeDeAlcohol((Math.min(getPorcentajeDeAlcohol(), (getCantidadDeLupus()*2)))*1.25);
	}

	
}
