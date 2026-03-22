package com.example.Fornecedores.Services;

import com.example.Fornecedores.Model.Fornecedor;
import com.example.Fornecedores.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    public Fornecedor criarFornecedor(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public List<Fornecedor> listarFornecedores() {
        return repository.findAll();
    }

    public Fornecedor buscarFornecedorPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarFornecedorPorId(Long id) {
        repository.deleteById(id);
    }
}
