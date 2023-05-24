package Pruebas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import Hamburguesas.Combo;
import Hamburguesas.Producto;

public class ComboTest {

	private Combo com;
	
	private Producto prod;
	
	public void setUp(String nombre, double precio) throws Exception {
		
		com = new Combo(nombre, precio);
		
	}
	
	public void testAgregarItemACombo() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {com.agregarItemACombo(prod);});
		
	}
	
	public void testGetNombre(String nombre) {
		
		assertTrue(nombre == com.getNombre());
		
	}
	
	public void testGetPrecio(int precio) {
		
		assertTrue(precio == com.getPrecio());
		
	}
	
	public void testGenerarTextoFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {com.generarTextoFactura();});
		
	}
	
	
}
