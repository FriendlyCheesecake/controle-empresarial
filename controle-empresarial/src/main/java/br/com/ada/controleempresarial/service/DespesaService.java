package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Despesa;
import br.com.ada.controleempresarial.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    private DespesaRepository despesaRepository;
    public Despesa salvar(Despesa despesa) {
        return despesaRepository.save(despesa);
    }

    public Despesa listarPorId(Long id) {
        return despesaRepository.findById(id).orElse(null);
    }

    public List<Despesa> listar() {
        return (List<Despesa>) despesaRepository.findAll();
    }

    public void deletarPorId(Long id) {
        despesaRepository.deleteById(id);
    }
}
