package test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import org.junit.Before;
import org.junit.Test;

import com.prueba.sga.domain.Persona;
import com.prueba.sga.servicio.PersonaService;


public class PersonaServiceTest {

	private PersonaService personaService;
	private static EJBContainer contenedor;
	private static Context contexto;
	
	@Before
	public void setUp() throws Exception{
		Map<String, Object> properties = new HashMap<String, Object>();
	    properties.put(EJBContainer.MODULES, new File("target/classes"));
		contenedor = EJBContainer.createEJBContainer(properties);
		contexto = contenedor.getContext();
		EJBContainer contenedor = EJBContainer.createEJBContainer();
		personaService = (PersonaService) contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!com.prueba.sga.servicio.PersonaServicio");
	}

	@Test
	public void testEJBPersonaService(){
//		System.out.println("Iniciando test EJB PersonaService");
//		assertTrue(personaService!=null);
//
//		assertEquals(2,personaService.listarPersonas().size());
//		
//		System.out.println("El no. de personas es igual a: " + personaService.listarPersonas().size());
//		
//		this.desplegarPersonas(personaService.listarPersonas());
//		System.out.println("Fin test EJB PersonaService");
	}

	private void desplegarPersonas(List<Persona> personas){
		
		for(Persona persona: personas){
			System.out.println(persona);
		}
	}
}
