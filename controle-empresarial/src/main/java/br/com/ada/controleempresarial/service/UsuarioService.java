package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Usuario;
import br.com.ada.controleempresarial.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario listarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public void deletarUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);
    }

}
