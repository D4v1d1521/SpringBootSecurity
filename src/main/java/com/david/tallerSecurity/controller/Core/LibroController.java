package com.david.tallerSecurity.controller.Core;


import com.david.tallerSecurity.Service.Core.ServiceLibro;
import com.david.tallerSecurity.model.Core.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libro/")
public class LibroController {

    @Autowired
    ServiceLibro service;

    @PostMapping("save")
    public Libro saveLibro(@RequestBody Libro libro){
        return service.saveLibro(libro);
    }

    @GetMapping("findById")
    public Libro findById(Integer id){
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

    @GetMapping("findByNombre")
    public List<Libro> findByNombre(String titulo){
        return service.findByNombre(titulo);
    }

    @GetMapping("findAll")
    public List<Libro> findAll(){
        return service.findAll();
    }

    @GetMapping("findByLibroAutor/{nombreLibro}")
    public List<Libro> buscarLibroPorAutor(@PathVariable String nombreLibro){
        return service.buscarLibrosPorAutor(nombreLibro);
    }




}
