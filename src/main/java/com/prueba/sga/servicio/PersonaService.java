package com.prueba.sga.servicio;

import java.util.List;

import javax.ejb.Local;

import com.prueba.sga.domain.Persona;

@Local
public interface PersonaService {

	public List<Persona> listarPersonas();

	public Persona encontrarPersonaPorId(Persona persona);

	public Persona encontrarPersonaPorEmail(Persona persona);

	public void resgistrarPersona(Persona persona);

	public void modificarPersona(Persona persona);

	public void eliminarPersona(Persona persona);
}
