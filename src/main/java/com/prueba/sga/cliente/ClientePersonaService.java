package com.prueba.sga.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.prueba.sga.domain.Persona;
import com.prueba.sga.domain.Usuario;
import com.prueba.sga.servicio.PersonaServiceRemote;
import com.prueba.sga.servicio.UsuarioServiceRemote;

public class ClientePersonaService {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciar el EJB desde cliente \n");
		System.setProperty("AS_DERBY_INSTALL","/home/oli/Descargas/glassfish4/javadb");


		try {
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-1.0-jar-with-dependencies/PersonaServiceImpl!com.prueba.sga.servicio.PersonaServiceRemote");
			UsuarioServiceRemote usuarioService = (UsuarioServiceRemote) jndi.lookup("java:global/sga-jee-1.0-jar-with-dependencies/UsuarioServiceImpl!com.prueba.sga.servicio.UsuarioServiceRemote");
			List<Persona> personas = personaService.listarPersonas();
			List<Usuario> usuarios = usuarioService.listarUsuarios();
			
			for(Persona persona : personas){
				System.out.println(persona.toString());
			}
			
			for(Usuario usuario : usuarios){
				System.out.println(usuario.toString());
			}
			
			System.out.println("\nFin de la llamada a EJB");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}