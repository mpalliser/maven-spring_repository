package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AgendaController {
	
	private AgendaService agenda;
	
	@Autowired
	public void setAgendaService(AgendaService agenda){
		this.agenda = agenda;
	}
	
	@RequestMapping(path="/nombre")
	@ResponseBody()
	public int nombrePersones() {
		return agenda.nombreContactes();	
	}
	
	@RequestMapping(path="/telefon")
	@ResponseBody()
	public String mostrarTelefon(String id) {
		Persona persona = agenda.recupera(id);
		return persona.getTelefon();
	}
	
	@RequestMapping(path="/contacte/{id}")
	@ResponseBody()
	public ResponseEntity<Persona> mostrarPersona(@PathVariable String id){
		if (agenda.getDB().containsKey(id)){
			Persona persona = agenda.recupera(id);
			return new ResponseEntity<>(persona, HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/afegir")
	@ResponseBody()
	public Persona creaPersona(String id, String nom, String telefon){
		agenda.inserta(id, nom, telefon);
		return agenda.recupera(id);
	}

}
