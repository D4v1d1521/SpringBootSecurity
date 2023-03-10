package com.david.tallerSecurity.Service.Core;


import com.david.tallerSecurity.model.Core.InfoAdicional;
import com.david.tallerSecurity.repository.Core.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInfo {

    @Autowired
    InfoRepository repository;

    public InfoAdicional saveInfo(InfoAdicional info){
        return repository.save(info);
    }

    public InfoAdicional findById(Integer id){
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

    public List<InfoAdicional> findAll(){
        return repository.findAll();
    }
}
