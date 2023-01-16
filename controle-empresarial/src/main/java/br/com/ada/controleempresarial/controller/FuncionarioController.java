package br.com.ada.controleempresarial.controller;

import br.com.ada.controleempresarial.model.Funcionario;
import br.com.ada.controleempresarial.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvar(funcionario);
    }

    @GetMapping("/{id}")
    public Funcionario listarFuncionarioPorId(@PathVariable Long id){
        return funcionarioService.listarPorId(id);
    }

    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    @DeleteMapping("/{id}")
    public void deletarFuncionario(@PathVariable Long id) {
        funcionarioService.deletar(id);
    }
}
