package com.prueba.sga.eis;

import java.util.List;

import com.prueba.sga.domain.Usuario;


public interface UsuarioDao {

	public List<Usuario> findAllUsuarios();
	
	public Usuario findUsuarioById(Usuario usuario);
	
	public Usuario findUsuarioByUsername(Usuario usuario);
	
	public void insertUsuario(Usuario usuario);
	
	public void updateUsuario(Usuario usuario);
	
	public void deleteUsuario(Usuario usuario);
}
