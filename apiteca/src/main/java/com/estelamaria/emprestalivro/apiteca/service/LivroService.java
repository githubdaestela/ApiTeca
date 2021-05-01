package com.estelamaria.emprestalivro.apiteca.service;

import com.estelamaria.emprestalivro.apiteca.model.Livro;
import com.estelamaria.emprestalivro.apiteca.model.Usuario;
import com.estelamaria.emprestalivro.apiteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    //Importando LivroRepository
    @Autowired
    private LivroRepository livroRepository;

    //Método que recebe o livro e salva pelo Repository
    public void salvaLivro(Livro livro) {

        livroRepository.save(livro);
    }
}
