package com.estelamaria.emprestalivro.apiteca.controller;

import com.estelamaria.emprestalivro.apiteca.model.Usuario;
import com.estelamaria.emprestalivro.apiteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    //Impotando classe UsuarioService
    @Autowired
    private UsuarioService usuarioService;

    //Método para salvar um usuario
    @PostMapping("/usuario")
    public void salvaUsuario(@RequestBody Usuario usuario) {

        usuarioService.salvaUsuario(usuario);
    }
}
