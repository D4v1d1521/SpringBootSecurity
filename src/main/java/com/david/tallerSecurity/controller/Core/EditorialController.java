package com.david.tallerSecurity.controller.Core;


import com.david.tallerSecurity.Service.Core.ServiceEditorial;
import com.david.tallerSecurity.model.Core.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/editorial/")
public class EditorialController {

    @Autowired
    ServiceEditorial service;

    @PostMapping("save")
    public Editorial saveEditorial(@RequestBody Editorial editorial){
        return service.SaveEditorial(editorial);
    }

    @GetMapping("findById")
    public Editorial findById(Integer id){
        return service.findbyId(id);
    }

    @GetMapping("buscarId")
    public boolean buscarId(Integer id){
        return service.buscarId(id);
    }

    @DeleteMapping("deleteById")
    public boolean deleteById(Integer id){
        return service.deleteById(id);
    }

    @GetMapping("findByLetra/{letra}")
    public Optional<Editorial> findByNombre(@PathVariable String letra){
        return service.findByLetra(letra);
    }


    @GetMapping("findAll")
    public List<Editorial> findAll(){
        return service.findAll();
    }


}
