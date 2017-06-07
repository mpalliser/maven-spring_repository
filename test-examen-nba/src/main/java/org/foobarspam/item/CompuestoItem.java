package org.foobarspam.item;

import java.util.Collection;
import java.util.List;

/**
 * Created by mariano.palliser on 06/06/2017.
 */
public class CompuestoItem extends Item {

	private List<Item> hijos;

	public CompuestoItem(String nombre) {
		super(nombre);
	}

}
