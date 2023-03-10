package com.david.tallerSecurity.repository.Core;


import com.david.tallerSecurity.model.Core.Editorial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EditorialRepository extends CrudRepository<Editorial, Integer> {


    List<Editorial> findAll();

    Optional<Editorial> findByNombreStartingWith(String letra);
}
