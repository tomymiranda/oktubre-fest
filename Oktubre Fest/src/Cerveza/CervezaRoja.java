package Cerveza;

public class CervezaRoja extends Cerveza {

	public CervezaRoja(String pais, int cantidadDeLupus) {
		super(pais, cantidadDeLupus,"roja");
		// TODO Ap�ndice de constructor generado autom�ticamente
	
	 setPorcentajeDeAlcohol((Math.min(getPorcentajeDeAlcohol(), (getCantidadDeLupus()*2)))*1.25);
	}

	
}
