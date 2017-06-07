package org.foobarspam.item;

import org.foobarspam.interfaces.Componible;
import org.foobarspam.interfaces.Iterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mariano.palliser on 06/06/2017.
 */
public class Item implements Componible,Iterable {

	private String nombre;

	private boolean compuesto;

	private List<Item> hijos = new ArrayList<Item>();

	public Item(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isCompuesto() {
		return compuesto;
	}

	public void setCompuesto(boolean compuesto) {
		this.compuesto = compuesto;
	}

	public Collection<Item> getHijos() {
		return hijos;
	}

	public void setHijos(List<Item> hijos) {
		this.hijos = hijos;
	}

	public void anhadir(Item item) {
		hijos.add(item);
		//System.out.println("OK: se ha añadido un equipo: " + item.getNombre());
	}

	public void composite(String[] newHijos) {
		for (String hijo : newHijos) {
			hijos.add(new Item(hijo));
		}

	}

	public void composite(Item[] newHijos) {
		for (Item hijo : newHijos) {
			hijos.add(hijo);
		}

	}

	public void iterable() {

		System.out.println( this.getNombre());
		for (Item hijo : this.hijos) {
			if (hijo.isCompuesto()) {
				hijo.iterable();
			} else {
				System.out.println("----------" + hijo.getNombre());
			}
		}
	}

//	public void quitar(String nombre){
//		for(int i = 0; i < hijos.size(); i++){
//			if(hijos.get(i).getNombre() == nombre){
//				hijos.remove(i);
//			}
//		}
//	}

	public void quitar(String nombre) {
		for (Item hijo : hijos) {
			if (hijo.getNombre().equals(nombre)) {
				hijos.remove(hijo);
				break;
			}
		}
	}

}
