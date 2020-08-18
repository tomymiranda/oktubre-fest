import org.junit.*;

import Carpa.Carpa;
import Carpa.CarpaDeCervezaNegra;
import Cerveza.Cerveza;
import Cerveza.CervezaNegra;
import Cerveza.CervezaRoja;
import Cerveza.CervezaRubia;
import Cerveza.JarraDeCerveza;
import Persona.Aleman;
import Persona.Belga;
import Persona.Checos;
import Persona.Persona;

public class RequerimientosTest {

	@Test
	public void seCreaCerveza(){
		Cerveza asd = new CervezaRubia(0.6,"argentina",12);
		Assert.assertNotNull(asd);
	}
	@Test
	public void elContenidoEs004(){
		Cerveza asd = new CervezaNegra("argentina",8);
		JarraDeCerveza jarra = new JarraDeCerveza(0.5);
		jarra.cargarCervezaEnJarra(asd);
		double contenidoDeAlcohol = jarra.calcularContenidoDeAlcoholEnJarra();
		Assert.assertEquals(0.04,contenidoDeAlcohol,0.001);
	}

	
	@Test
	public void laPersonaNoEstaEbria(){
		Persona marioGotze = new Aleman(60, false, 20);
		Cerveza asd = new CervezaRubia(0.6,"argentina",4);
		JarraDeCerveza jarra1 = new JarraDeCerveza(0.5);
		
		jarra1.cargarCervezaEnJarra(asd);
		/*
		Assert.assertNotNull(jarra1);
		*/
		marioGotze.tomarCerveza(jarra1);
		
		
		boolean noEstaOEbrio = marioGotze.estaEbrio();
		Assert.assertFalse(noEstaOEbrio);
		
	}
	
	@Test
	public void laPersonaEstaEbria(){
		Persona cech = new Checos(80, false, 30);
		Cerveza asd = new CervezaRubia(0.6,"argentina",12);
		JarraDeCerveza jarra1 = new JarraDeCerveza(0.5);
		
		jarra1.cargarCervezaEnJarra(asd);
		
		cech.tomarCerveza(jarra1);
		
		JarraDeCerveza jarra2 = new JarraDeCerveza(1);
		Cerveza dfg = new CervezaRubia(0.9,"argentina",12);
		jarra2.cargarCervezaEnJarra(dfg);
		
		cech.tomarCerveza(jarra2);
		
		JarraDeCerveza jarra3 = new JarraDeCerveza(1);
		Cerveza pepito = new CervezaRoja("argentina" , 8);
		jarra3.cargarCervezaEnJarra(pepito);
		
		cech.tomarCerveza(jarra3);
		
		boolean estaEbrio = cech.estaEbrio();
		Assert.assertTrue(estaEbrio);
	}

	@Test
	public void alBelgaLeGustaLaRubia(){
		Cerveza asd = new CervezaRubia(0.8,"argentina",12);
		Persona hazard = new Belga(80, true, 32);
		boolean leGusta = hazard.leGustaLaCerveza(asd);
		Assert.assertTrue(leGusta);
	}

	@Test
	public void dejanEntrarACechALaCarpa(){
		Persona cech = new Checos(80, true, 30);
		Carpa carpiña = new CarpaDeCervezaNegra(25, true, null, 0);
		carpiña.entrarPersonaEnCarpa(cech);
		int cantidadDePersonasEnLaCarpa = carpiña.cantidadDePersonasEnLaCarpa();
		Assert.assertEquals(1, cantidadDePersonasEnLaCarpa,0.001);
	}
	
	@Test
	public void estaEbrioCechYNoPuedeEntrar(){
		Persona cech = new Checos(80, false, 30);
		
		JarraDeCerveza jarra1 = new JarraDeCerveza(0.5);
		Cerveza asd = new CervezaRubia(0.6,"argentina",12);
		jarra1.cargarCervezaEnJarra(asd);
		
		cech.tomarCerveza(jarra1);
		
		JarraDeCerveza jarra2 = new JarraDeCerveza(1);
		Cerveza dfg = new CervezaRubia(0.6,"argentina",12);
		jarra2.cargarCervezaEnJarra(dfg);
		
		cech.tomarCerveza(jarra2);
		
		JarraDeCerveza jarra3 = new JarraDeCerveza(1);
		Cerveza popi = new CervezaRoja("argentina" , 8);
		jarra3.cargarCervezaEnJarra(popi);
		
		cech.tomarCerveza(jarra3);
		
		Carpa carpiña = new CarpaDeCervezaNegra(25, true, null, 0);
	
		boolean puedeONo = carpiña.puedeEntrarUnaPersona(cech);
		
		Assert.assertFalse(puedeONo);

	}
	
	//este test es antes del metodo vender de la carpa
		@Test
	public void laCantidadDeEbriosEmperdinosEs1(){
			
			Carpa carpiña = new CarpaDeCervezaNegra(25, true, null, 0);
			
			Persona cech = new Checos(80, true, 30);
			Persona hazard = new Belga(80, true, 32);
			carpiña.entrarPersonaEnCarpa(hazard);
			carpiña.entrarPersonaEnCarpa(cech);
			
			Cerveza godines = new CervezaRubia(0.6,"argentina",12);
			Cerveza popi = new CervezaRoja("argentina" , 8);
			Cerveza jaimito = new CervezaRoja("argentina" , 8);
			Cerveza donRamon = new CervezaRubia(0.5,"argentina",12);
			Cerveza quico = new CervezaRubia(0.7,"argentina",12);
			Cerveza chavo = new CervezaRubia(0.6,"argentina",12);
			
			JarraDeCerveza jarra1 = new JarraDeCerveza(0.5);
			jarra1.cargarCervezaEnJarra(godines);
			
			JarraDeCerveza jarra2 = new JarraDeCerveza(1);
			jarra2.cargarCervezaEnJarra(popi);
			
			JarraDeCerveza jarra3 = new JarraDeCerveza(1);
			jarra3.cargarCervezaEnJarra(jaimito);
			
			JarraDeCerveza jarra4 = new JarraDeCerveza(1);
			jarra4.cargarCervezaEnJarra(donRamon);
			
			JarraDeCerveza jarra5 = new JarraDeCerveza(1);
			jarra5.cargarCervezaEnJarra(quico);
			
			JarraDeCerveza jarra6 = new JarraDeCerveza(1);
			jarra6.cargarCervezaEnJarra(chavo);
			
			cech.tomarCerveza(jarra1);
			cech.tomarCerveza(jarra2);
			cech.tomarCerveza(jarra3);
			hazard.tomarCerveza(jarra4);
			hazard.tomarCerveza(jarra5);
			hazard.tomarCerveza(jarra6);
			
			int total = carpiña.cantidadDeEbriosEmpedernidosEnLaCarpa();
			
			Assert.assertEquals(1, total);
		}


		@Test
		public void noEstaEntrandoEnElVicio(){
			
			Persona hazard = new Belga(80, true, 32);
			
			Cerveza donRamon = new CervezaRubia(0.5,"argentina",12);
			Cerveza quico = new CervezaRubia(0.7,"argentina",12);
			Cerveza chavo = new CervezaRubia(0.6,"argentina",12);
		
			JarraDeCerveza jarra4 = new JarraDeCerveza(0.5);
			jarra4.cargarCervezaEnJarra(donRamon);
			
			JarraDeCerveza jarra5 = new JarraDeCerveza(1);
			jarra5.cargarCervezaEnJarra(quico);
			
			JarraDeCerveza jarra6 = new JarraDeCerveza(0.75);
			jarra6.cargarCervezaEnJarra(chavo);
		
		
			hazard.tomarCerveza(jarra4);
			hazard.tomarCerveza(jarra5);
			hazard.tomarCerveza(jarra6);
		
			boolean entra = hazard.estaEntrandoEnElVicio();
			
			Assert.assertFalse(entra);
		
		}


}
