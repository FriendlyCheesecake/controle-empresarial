package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Funcionario;
import br.com.ada.controleempresarial.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;
    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario listarPorId(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public List<Funcionario> listar() {
        return (List<Funcionario>) funcionarioRepository.findAll();
    }

    public void deletar(Long id) {
        funcionarioRepository.deleteById(id);

    }
}
