package com.prueba.sga.servicio;

import java.util.List;

import javax.ejb.Local;

import com.prueba.sga.domain.Usuario;

@Local
public interface UsuarioService {

	public List<Usuario> listarUsuarios();

	public Usuario encontrarUsuarioPorId(Usuario usuario);

	public Usuario encontrarUsuarioPorUsername(Usuario usuario);

	public void resgistrarUsuario(Usuario usuario);

	public void modificarUsuario(Usuario usuario);

	public void eliminarUsuario(Usuario usuario);
}
