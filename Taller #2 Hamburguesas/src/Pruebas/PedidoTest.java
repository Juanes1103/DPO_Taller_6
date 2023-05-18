package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.io.File;
import java.time.Duration;

import Hamburguesas.Pedido;
import Hamburguesas.Producto;

public class PedidoTest {

	private Pedido ped;
	private Producto prod;
	private File archivo;
	private String nom;
	private String dir;
	
	public void setUp() throws Exception{
		
		ped = new Pedido(nom, dir);
		
	}
	
	public void testGetIdPedidos() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {ped.getIdPedidos();});
		
	}
	
	public void testAgregarProducto() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {ped.agregarProducto(prod);});
		
	}
	
	public void testGenerarTextoFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {ped.generTextoFactura();});
		
	}
	
	public void testGuardarFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {ped.guardarFactura(archivo);});
		
	}
	
	
	
}
