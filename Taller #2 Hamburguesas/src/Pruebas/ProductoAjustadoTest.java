package Pruebas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import Hamburguesas.ProductoAjustado;
import Hamburguesas.ProductoMenu;

public class ProductoAjustadoTest {
	
	private ProductoAjustado proAju;

	
	public void setUp(ProductoMenu producto) throws Exception{
		
		proAju = new ProductoAjustado(producto);
		
	}
	
	public void testGetNombre(ProductoAjustado producto) {
		
		assertTrue(producto.getNombre() == proAju.getNombre());
		
	}
	
	public void testGetPrecio(ProductoMenu producto) {
		
		assertTrue(producto.getPrecios() == proAju.getPrecio());
		
	}
	
	
	public void testGenerarTextoFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {proAju.generarTextoFactura();});
		
	}
}
