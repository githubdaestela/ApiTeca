package com.estelamaria.emprestalivro.apiteca.service;

import com.estelamaria.emprestalivro.apiteca.model.Usuario;
import com.estelamaria.emprestalivro.apiteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    //Importando UsuarioRepository
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Método que recebe o Usuario e salva pelo Repository
    public void salvaUsuario(Usuario usuario) {

        usuarioRepository.save(usuario);
    }
}
