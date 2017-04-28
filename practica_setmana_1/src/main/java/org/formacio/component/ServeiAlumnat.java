package org.formacio.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by mariano.palliser on 28/04/2017.
 */
@Component
public class ServeiAlumnat {

	@Autowired
	RepositoriAlumnes bbdd;

	@PostConstruct
	private void insetarAlumnes() {
		bbdd.altaAlumne(1, "Antonia");
		bbdd.altaAlumne(2, "Joan");
	}

	public boolean matricula (int id, String alumne) {

		if (alumne != null) {
			bbdd.altaAlumne(id, alumne);
			return true;
		} else {
			return false;
		}
	}

}
