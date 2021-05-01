package com.estelamaria.emprestalivro.apiteca.controller;

import com.estelamaria.emprestalivro.apiteca.model.Emprestimo;
import com.estelamaria.emprestalivro.apiteca.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {

    //Impotando classe EmprestimoService
    @Autowired
    private EmprestimoService emprestimoService;

    //Método para salvar um emprestimo
    @PostMapping("/emprestimo")
    public void salvaEmprestimo(@RequestBody Emprestimo emprestimo) {

        emprestimoService.salvaEmprestimo(emprestimo);
    }
}
