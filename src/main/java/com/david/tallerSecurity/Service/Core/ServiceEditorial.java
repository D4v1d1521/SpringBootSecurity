package com.david.tallerSecurity.Service.Core;


import com.david.tallerSecurity.model.Core.Editorial;
import com.david.tallerSecurity.repository.Core.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEditorial {

    @Autowired
    EditorialRepository repository;

    public Editorial SaveEditorial(Editorial editorial){
        return repository.save(editorial);
    }

    public Editorial findbyId(Integer id){
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

    public Optional<Editorial> findByLetra(String letra){
        return repository.findByNombreStartingWith(letra);
    }

    public List<Editorial> findAll(){
        return repository.findAll();
    }
}
