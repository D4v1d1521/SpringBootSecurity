package com.david.tallerSecurity.Service.Acl;

import com.david.tallerSecurity.model.Acl.Usuario;

import com.david.tallerSecurity.repository.Acl.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario agregar(Usuario usuario){
        return repository.save(usuario);
    }
}
