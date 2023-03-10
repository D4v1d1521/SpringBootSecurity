package com.david.tallerSecurity.Service.Core;


import com.david.tallerSecurity.model.Core.Categoria;
import com.david.tallerSecurity.repository.Core.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategoria {

    @Autowired
    CategoriaRepository repository;

    public Categoria saveCategoria(Categoria categoria){
        return repository.save(categoria);
    }

    public Categoria findById(Integer id){
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

    public List<Categoria> findAll(){
        return repository.findAll();
    }

}
