package com.example.Fornecedores.Controller;

import com.example.Fornecedores.Model.Fornecedor;
import com.example.Fornecedores.Services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @PostMapping
    public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
        return service.criarFornecedor(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return service.listarFornecedores();
    }

    @GetMapping("/{id}")
    public Fornecedor buscarPorId(@PathVariable Long id) {
        return service.buscarFornecedorPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        service.deletarFornecedorPorId(id);
    }
}
