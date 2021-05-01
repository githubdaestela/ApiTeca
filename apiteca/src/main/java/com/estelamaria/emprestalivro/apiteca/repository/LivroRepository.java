package com.estelamaria.emprestalivro.apiteca.repository;

import com.estelamaria.emprestalivro.apiteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}

//Aqui foi implementado o Jpa e importada a classe Livro