package Cerveza;

public class CervezaNegra extends Cerveza {

	public CervezaNegra(String pais, int cantidadDeLupus) {
		super( pais, cantidadDeLupus,"negra");
		// TODO Ap�ndice de constructor generado autom�ticamente
		
		setPorcentajeDeAlcohol(Math.min(getPorcentajeDeAlcohol(), (getCantidadDeLupus()*2)));
	}



}
