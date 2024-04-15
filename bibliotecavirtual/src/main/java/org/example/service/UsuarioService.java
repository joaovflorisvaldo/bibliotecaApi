package org.example.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.model.Usuario;
import org.example.repository.UsuarioRepository;

import java.util.List;
@Stateless
public class UsuarioService {
    @Inject
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.listarTodosUsuario();
    }
    public void cadastrar(Usuario usuario) throws Exception {
        usuarioRepository.cadastrar(usuario);
    }
}
