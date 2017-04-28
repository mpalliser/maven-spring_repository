package org.formacio.component;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mariano.palliser on 28/04/2017.
 */
@Component
public class RepositoriAlumnesMemoria implements RepositoriAlumnes{

	private Map<Integer, String> bbdd = new HashMap<>();

	@Override
	public String obteAlumne(int id) {
		return bbdd.get(id);
	}

	@Override
	public void altaAlumne(int id, String nom) {
		bbdd.put(id,  nom);
	}

	@Override
	public Collection<String> llistaAlumnes() {
		return bbdd.values();
	}

}
