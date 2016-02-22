package com.prueba.sga.servicio;

import java.util.List;

import javax.ejb.Remote;

import com.prueba.sga.domain.Usuario;

@Remote
public interface UsuarioServiceRemote {

	public List<Usuario> listarUsuarios();

	public Usuario encontrarUsuarioPorId(Usuario usuario);

	public Usuario encontrarUsuarioPorUsername(Usuario usuario);

	public void resgistrarUsuario(Usuario usuario);

	public void modificarUsuario(Usuario usuario);

	public void eliminarUsuario(Usuario usuario);
}
