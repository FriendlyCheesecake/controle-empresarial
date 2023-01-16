package br.com.ada.controleempresarial.controller;

import br.com.ada.controleempresarial.model.Usuario;
import br.com.ada.controleempresarial.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    @GetMapping("/{id}")
    public Usuario listarPorId(@PathVariable Long id) {
        return usuarioService.listarPorId(id);
    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    @DeleteMapping("/{id}")
    public void deletarUsuarioPorId(@PathVariable Long id) {
        usuarioService.deletarUsuarioPorId(id);
    }

}
