package Excepciones;

import java.util.ArrayList;

import Hamburguesas.*;

public abstract class HamburguesaException {

	private ArrayList<String> nomIng = new ArrayList<String>();
	private ArrayList<String> nomProd = new ArrayList<String>();
	
	private String nomI = "";
	private String nomP = "";
	
	public String crearHamEx(String nombreI, String nombreP) throws Exception {
		
		if (nomIng.size() == 0 || nomProd.size() == 0 ) {
			
			if (nomIng.size() == 0) {
				nomIng.add(nombreI);
				
			} else {
				nomProd.add(nombreP);
				
			}
			
		} else {
			
			for (int i = 0; i<nomIng.size(); i++) {
				
				nomI = nomIng.get(i);
				
				if (nomI == nombreI) {
					return "Ya existe un producto con ese nombre";
				} else {
					continue;
				}
				
			}
			
			for (int i = 0; i<nomProd.size(); i++) {
				
				nomP = nomProd.get(i);
				
				if (nomP == nombreP) {
					return "Ya existe un producto con ese costo";
				} else {
					continue;
				}
				
			}
			
			
		}
		
		return null;
		
	}
	
	
}
