package Excepciones;

import java.util.ArrayList;

import Hamburguesas.*;

public class ProductoRepetidoException extends HamburguesaException{
	
	private ArrayList<String> nomIng = new ArrayList<String>();
	private ArrayList<Integer> cosIng = new ArrayList<Integer>();
	
	private String nom = "";
	private int cos = 0;
	
	public String crearProdEx(String nombre, int costo) throws Exception {
		
		if (nomIng.size() == 0 || cosIng.size() == 0 ) {
			
			if (nomIng.size() == 0) {
				nomIng.add(nombre);
				
			} else {
				cosIng.add(costo);
				
			}
			
		} else {
			
			for (int i = 0; i<nomIng.size(); i++) {
				
				nom = nomIng.get(i);
				
				if (nom == nombre) {
					return "Ya existe un producto con ese nombre";
				} else {
					continue;
				}
				
			}
			
			for (int i = 0; i<cosIng.size(); i++) {
				
				cos = cosIng.get(i);
				
				if (cos == costo) {
					return "Ya existe un producto con ese costo";
				} else {
					continue;
				}
				
			}
			
			
		}
		
		return null;
		
	}
	
	
}
