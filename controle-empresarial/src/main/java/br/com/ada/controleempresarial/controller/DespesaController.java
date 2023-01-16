package br.com.ada.controleempresarial.controller;

import br.com.ada.controleempresarial.model.Despesa;
import br.com.ada.controleempresarial.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvar(despesa);
    }

    @GetMapping("/{id}")
    public Despesa listarPorId(@PathVariable Long id) {
        return despesaService.listarPorId(id);
    }

    @GetMapping
    public List<Despesa> listar() {
        return despesaService.listar();
    }

    @DeleteMapping("/{id}")
    public void deletarDespesa(@PathVariable Long id) {
        despesaService.deletarPorId(id);
    }
}
