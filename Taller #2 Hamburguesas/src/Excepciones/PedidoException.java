package Excepciones;

public class PedidoException {
	
	public String crearPedExc(int valor) throws Exception{
		
		if(valor == 150000) {
			return "El pedido excede el valor máximo de 150000";
		} else {
			return "El pedido tiene un valor de " + valor;
		}
	}
	
}
