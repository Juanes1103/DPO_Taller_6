package consola;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Hamburguesas.Restaurante;


public class Aplicación {
	
	private Restaurante restaurante;
	
	public static void main(String[] args) throws IOException {
	
		Aplicación app = new Aplicación();
	
		boolean cont = true;
		while(cont) {
			try {
				app.mostrarMenu();
				System.out.println("\nIngrese una opcion: ");
				Scanner op = new Scanner(System.in);
				int opcion = op.nextInt();
				
				if (opcion == 6) {
					cont = false;
					System.out.println("\nGracias por utilizar el menu!");
				}
				app.ejecutarOpcion(opcion);
				
			} catch (NumberFormatException e) {
				System.out.println("\nSeleccione una opción valida");
				
				app.Espacio();
			}
		}
		
	}
	
	public void mostrarMenu() {
		
		System.out.println("Bienvenido al restaurante");
		System.out.println("Seleccione la opcion de su gusto");
		System.out.println("1. Mostrar el menu");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerra pedido y guardar factura");
		System.out.println("5. Consultar la información de un pedido dada su id");
		System.out.println("6. Salir del menu");
		
	}
	
	public void ejecutarOpcion(int opcionSeleccionada) throws IOException{
		
		if (opcionSeleccionada == 1) {
					
			ejecutarCargarMenu();
			Espacio();
					
		} else if (opcionSeleccionada == 2) {
					
			ejecutarIniciarPedido();
			Espacio();
					
		} else if (opcionSeleccionada == 3) {
					
			ejecutarAgregarElemento();
			Espacio();
					
		} else if (opcionSeleccionada == 4) {
					
			ejecutarCerrarPedido();
			Espacio();
					
		} else if (opcionSeleccionada == 5) {
					
			ejecutarConsultarInformacion();
			Espacio();
					
		} else if (opcionSeleccionada == 6){
			Espacio();
			
		} else {
			System.out.println("\nSeleccione una opción valida");
					
			Espacio();
		}
				
			
	}
		
			
	public void ejecutarCargarMenu() throws IOException {
		System.out.println("\nCargando el menu..." );
		File archivoIngredientes = new File("./data/ingredientes.txt");
		File archivoMenu = new File("./data/menu.txt");
		File archivoCombo = new File("./data/combos.txt");
	    File archivoBebidas = new File("./data/bebidas.txt");
		restaurante = Restaurante.cargarInformacionRestaurante(archivoIngredientes, archivoMenu, archivoCombo);
		System.out.println(restaurante);
	}
	
	public void ejecutarIniciarPedido() {
		System.out.println("\nIniciando nuevo pedido...");
		
		System.out.println("\nIngrese un nombre para el pedido: ");
		Scanner nom = new Scanner(System.in);
		String nombre = nom.nextLine();
		System.out.println("\nIngrese una direccion para el pedido: ");
		Scanner dir = new Scanner(System.in);
		String direccion = dir.nextLine();
		
		restaurante.iniciarPedido(nombre, direccion);
		
	}
	
	public void ejecutarAgregarElemento() {
		System.out.println("\nAgregando nuevo elemento...");
		
		restaurante.agregarElementoPedido();
		
	}
	
	public void ejecutarCerrarPedido() {
		System.out.println("\nCerrando pedido...");
		restaurante.cerrarYGuardarPedido();
		
	}
	
	public void ejecutarConsultarInformacion() {
		System.out.println("\nConsultando información del pedido...");
		System.out.println("\nIngrese la id del pedido para hacer la consulta: ");
		Scanner id = new Scanner(System.in);
		String idPedido = id.nextLine();
		restaurante.getPedidoEnCurso(idPedido);
		
	}
	
	public void Espacio() {
		System.out.print("\n");
	}

}
