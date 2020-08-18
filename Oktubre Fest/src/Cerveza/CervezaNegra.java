package Cerveza;

public class CervezaNegra extends Cerveza {

	public CervezaNegra(String pais, int cantidadDeLupus) {
		super( pais, cantidadDeLupus,"negra");
		// TODO Apéndice de constructor generado automáticamente
		
		setPorcentajeDeAlcohol(Math.min(getPorcentajeDeAlcohol(), (getCantidadDeLupus()*2)));
	}



}
