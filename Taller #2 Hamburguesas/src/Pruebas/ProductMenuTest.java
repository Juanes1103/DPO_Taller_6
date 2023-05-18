package Pruebas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import Hamburguesas.*;

public class ProductMenuTest {
	
	private ProductoMenu proMen;
	private String nombre;
	private int valor;
	
	public void setUp() throws Exception {
		
		proMen = new ProductoMenu(nombre, valor);
		
	}
	
	public void testGetNombre() {
		
		assertTrue(nombre == proMen.getNombres());
		
	}
	
	public void testGetPrecios() {
		
		assertTrue(valor == proMen.getPrecios());
		
	}
	
	public void testGenerarTextoFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {proMen.generarTextoFactura();});
		
	}
	
}
