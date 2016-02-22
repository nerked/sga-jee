package com.prueba.sga.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.prueba.sga.domain.Persona;
import com.prueba.sga.eis.PersonaDao;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

	@EJB
	private PersonaDao personaDao;
	
	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}

	public Persona encontrarPersonaPorId(Persona persona) {
		return personaDao.findPersonaById(persona);
	}

	public Persona encontrarPersonaPorEmail(Persona persona) {
		return personaDao.findPersonaByEmail(persona);
	}

	public void resgistrarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}

	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}

	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}

}
