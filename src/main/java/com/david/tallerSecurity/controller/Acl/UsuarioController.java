package com.david.tallerSecurity.controller.Acl;
import com.david.tallerSecurity.Service.Acl.UsuarioService;
import com.david.tallerSecurity.model.Acl.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario/")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    public Usuario agregarUsuario(Usuario usuario){
        return service.agregar(usuario);
    }
}
