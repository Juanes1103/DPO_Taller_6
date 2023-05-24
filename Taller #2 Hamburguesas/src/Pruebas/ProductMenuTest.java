package Pruebas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import Hamburguesas.*;

public class ProductMenuTest {
	
	private ProductoMenu proMen;
	
	public void setUp(String nombre, int valor) throws Exception {
		
		proMen = new ProductoMenu(nombre, valor);
		
	}
	
	public void testGetNombre(String nombre) {
		
		assertTrue(nombre == proMen.getNombres());
		
	}
	
	public void testGetPrecios(int valor) {
		
		assertTrue(valor == proMen.getPrecios());
		
	}
	
	public void testGenerarTextoFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {proMen.generarTextoFactura();});
		
	}
	
}
