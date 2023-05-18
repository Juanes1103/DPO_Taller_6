package Hamburguesas;

import java.io.File;
import Hamburguesas.Producto;
import Excepciones.PedidoException;

public class Pedido {
	
	//Atributos
	private PedidoException pedE;
	
	private static int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	private Producto itemsPedido;
	
	//Métodos
	public Pedido(String nombreCliente, String direccionCliente) {
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
	}
	
	public int getIdPedidos() {
		return 0;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		
		try {
			pedE.crearPedExc(getPrecioTotalPedido());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private int getPrecioNetoPedido() {
		return 0;
	}
	
	private int getPrecioTotalPedido() {
		return 0;
	}
	
	private int getPrecioIVAPedido() {
		return 0;
	}
	
	private String generTextoFactura() {
		return null;
	}
	
	public void guardarFactura(File archivo) {
		
	}
	
	//Setters y Getters
	public static int getNumeroPedidos() {
		return numeroPedidos;
	}
	public static void setNumeroPedidos(int numeroPedidos) {
		Pedido.numeroPedidos = numeroPedidos;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	
	

}
