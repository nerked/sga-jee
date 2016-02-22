package com.prueba.sga.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.prueba.sga.domain.Usuario;
import com.prueba.sga.eis.UsuarioDao;

@Stateless
public class UsuarioServiceImpl implements UsuarioServiceRemote, UsuarioService{

	@EJB
	private UsuarioDao usuarioDao;
	
	public List<Usuario> listarUsuarios() {
		return usuarioDao.findAllUsuarios();
	}

	public Usuario encontrarUsuarioPorId(Usuario usuario) {
		return usuarioDao.findUsuarioById(usuario);
	}

	public Usuario encontrarUsuarioPorUsername(Usuario usuario) {
		return usuarioDao.findUsuarioByUsername(usuario);
	}

	public void resgistrarUsuario(Usuario usuario) {
		usuarioDao.insertUsuario(usuario);
	}

	public void modificarUsuario(Usuario usuario) {
		usuarioDao.updateUsuario(usuario);
	}

	public void eliminarUsuario(Usuario usuario) {
		usuarioDao.deleteUsuario(usuario);
	}

}
