package com.estelamaria.emprestalivro.apiteca.controller;

import com.estelamaria.emprestalivro.apiteca.model.Livro;
import com.estelamaria.emprestalivro.apiteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    //Impotando classe LivroService
    @Autowired
    private LivroService livroService;

    //Método para salvar um livro
    @PostMapping("/livro")
    public void salvaLivro(@RequestBody Livro livro) {
        livroService.salvaLivro(livro);
    }
}
