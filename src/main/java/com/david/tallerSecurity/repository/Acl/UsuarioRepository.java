package com.david.tallerSecurity.repository.Acl;

import com.david.tallerSecurity.model.Acl.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Optional<Usuario> findOneByEmail(String email);
}
