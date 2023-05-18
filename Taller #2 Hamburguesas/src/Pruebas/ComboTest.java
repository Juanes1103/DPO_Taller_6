package Pruebas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import Hamburguesas.Combo;
import Hamburguesas.Producto;

public class ComboTest {

	private Combo com;
	private String nombre;
	private double precio;
	
	private Producto prod;
	
	public void setUp() throws Exception {
		
		com = new Combo(nombre, precio);
		
	}
	
	public void testAgregarItemACombo() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {com.agregarItemACombo(prod);});
		
	}
	
	public void testGetNombre() {
		
		assertTrue(nombre == com.getNombre());
		
	}
	
	public void testGetPrecio() {
		
		assertTrue(precio == com.getPrecio());
		
	}
	
	public void testGenerarTextoFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {com.generarTextoFactura();});
		
	}
	
	
}
