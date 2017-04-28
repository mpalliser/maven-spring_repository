package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mariano.palliser on 28/04/2017.
 */
//@RestController			<-- hace la misma funcion que @Controller + @ResponseBody.
@Controller
public class ControladorAlumnat {

	@Autowired
	ServeiAlumnat alumnatService;

	@RequestMapping(path="/alumnes")
	@ResponseBody
	public String mostrarAlumnes() {
		return String.valueOf(alumnatService.alumnesRegistrats());
	}

}
