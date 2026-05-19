package com.senai.pi.fundacaopet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.fundacaopet.models.Usuario;
import com.senai.pi.fundacaopet.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Listar todos os usuários
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // Buscar usuário por ID
    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Salvar usuário
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Atualizar usuário
    public Usuario atualizarUsuario(Integer id, Usuario usuarioAtualizado) {
        Usuario usuario = buscarPorId(id);

        if (usuario != null) {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setSenha(usuarioAtualizado.getSenha());
            usuario.setCidade(usuarioAtualizado.getCidade());

            return usuarioRepository.save(usuario);
        }

        return null;
    }

    // Deletar usuário
    public void deletarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}