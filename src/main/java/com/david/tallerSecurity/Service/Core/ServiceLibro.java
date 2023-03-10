package com.david.tallerSecurity.Service.Core;


import com.david.tallerSecurity.model.Core.Libro;
import com.david.tallerSecurity.repository.Core.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLibro {

    @Autowired
    LibroRepository repository;

    public Libro saveLibro(Libro libro){
        return repository.save(libro);
    }

    public Libro findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public boolean buscarId(Integer id){
        if(repository.findById(id).isPresent()){
            return true;
        }else {
            return false;
        }

    }

    public boolean deleteById(Integer id){
        try {
            repository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public List<Libro> findByNombre(String titulo){
        return repository.findByNombre(titulo);
    }

    public List<Libro> findAll(){
        return repository.findAll();
    }

    public List<Libro> buscarLibrosPorAutor(String nombreAutor) {
        return repository.findByAutorNombre(nombreAutor);
    }

}
