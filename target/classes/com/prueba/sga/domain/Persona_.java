package com.prueba.sga.domain;

import com.prueba.sga.domain.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-02-22T14:29:32")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apeMaterno;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile SetAttribute<Persona, Usuario> usuarios;
    public static volatile SingularAttribute<Persona, String> apePaterno;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, Integer> idPersona;
    public static volatile SingularAttribute<Persona, String> email;

}