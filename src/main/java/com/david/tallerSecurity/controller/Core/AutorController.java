package com.david.tallerSecurity.controller.Core;


import com.david.tallerSecurity.Service.Core.ServiceAutor;
import com.david.tallerSecurity.model.Core.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autor/")
public class AutorController {

    @Autowired
    ServiceAutor service;

    @PostMapping("save")
    public Autor saveAutor(@RequestBody Autor autor){
        return service.saveAutor(autor);
    }

    @GetMapping("findById")
    public Autor findById(Integer id){
        return service.findById(id);
    }

    @GetMapping("buscarId")
    public boolean buscarId(Integer id){
        return service.buscarId(id);
    }

    @DeleteMapping("deleteById")
    public boolean deleteById(Integer id){
        return service.deleteById(id);
    }

    @GetMapping("findAll")
    public List<Autor> findAll(){
        return service.findAll();
    }

    @PutMapping("/{autor_id}/libro/{libros_id}")
    public Autor asignarLibrosAutor(
            @PathVariable Integer autor_id,
            @PathVariable Integer libros_id
    ){
        return service.asignar(autor_id, libros_id);
    }


}
