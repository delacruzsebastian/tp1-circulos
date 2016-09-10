package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo miCirculo = new Circulo();
		Double radioEsperado = 2.0;
		Double radioObtenido;		
		
		miCirculo.crearCirculo(radioEsperado);
		
		radioObtenido = miCirculo.mostrarRadio();
		
		assertEquals(radioEsperado, radioObtenido, 0.01);
		
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Double radioEsperado = 3.7;
		Double radioObtenido;
		
		Circulo miCirculo = new Circulo(radioEsperado);

		radioObtenido = miCirculo.mostrarRadio();
		
		assertEquals(radioEsperado, radioObtenido, 0.01);
		
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Double radioEsperado = 5.0;
		Double radioObtenido;
		
		Circulo miCirculo = new Circulo(radioEsperado);

		radioObtenido = miCirculo.mostrarRadio();
		
		assertEquals(radioEsperado, radioObtenido, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Double radioEsperado = 10.9;
		Double radioObtenido;
		
		Circulo miCirculo = new Circulo(radioEsperado);

		radioObtenido = miCirculo.mostrarRadio();
		
		assertEquals(radioEsperado, radioObtenido, 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Double radioRequerido = 9.8;
		Double areaObtenida;
		Double areaEsperada = 615.73;
		
		Circulo miCirculo = new Circulo(radioRequerido);

		areaObtenida = miCirculo.mostrarArea();
		
		assertEquals(areaEsperada, areaObtenida, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Double radioRequerido = 16.6;
		Double areaObtenida;
		Double areaEsperada = 865.67;
		
		Circulo miCirculo = new Circulo(radioRequerido);

		areaObtenida = miCirculo.mostrarArea();
		
		assertEquals(areaEsperada, areaObtenida, 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
