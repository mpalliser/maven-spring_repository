package org.formacio.component;

import java.util.Collection;

/**
 * Created by mariano.palliser on 28/04/2017.
 */
public interface RepositoriAlumnes {

	String obteAlumne(int id);

	void altaAlumne(int id, String nom);

	Collection<String> llistaAlumnes();


}
