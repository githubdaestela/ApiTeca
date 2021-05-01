package com.estelamaria.emprestalivro.apiteca.repository;

import com.estelamaria.emprestalivro.apiteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

//Aqui foi implementado o Jpa e imporatado a classe Usuario