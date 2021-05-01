package com.estelamaria.emprestalivro.apiteca.repository;


import com.estelamaria.emprestalivro.apiteca.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpestimoRepository extends JpaRepository<Emprestimo, Long> {

}

//Aqui foi implementado o Jpa e imporatado a classe Emprestimo