package com.david.tallerSecurity.repository.Core;


import com.david.tallerSecurity.model.Core.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

    List<Categoria> findAll();
}
