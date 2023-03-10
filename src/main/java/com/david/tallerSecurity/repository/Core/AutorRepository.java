package com.david.tallerSecurity.repository.Core;

import com.david.tallerSecurity.model.Core.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Integer> {

    List<Autor> findAll();
}
