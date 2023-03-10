package com.david.tallerSecurity.controller.Core;

import com.david.tallerSecurity.Service.Core.ServiceCategoria;
import com.david.tallerSecurity.model.Core.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria/")
public class CategoriaController {

    @Autowired
    ServiceCategoria service;

    @PostMapping("save")
    public Categoria saveCategoria(@RequestBody Categoria categoria){
        return service.saveCategoria(categoria);
    }

    @GetMapping("findById")
    public Categoria findById(Integer id){
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
    public List<Categoria> findAll(){
        return service.findAll();
    }
}
