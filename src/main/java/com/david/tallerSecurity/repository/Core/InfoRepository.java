package com.david.tallerSecurity.repository.Core;


import com.david.tallerSecurity.model.Core.InfoAdicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoRepository extends CrudRepository<InfoAdicional, Integer> {

    List<InfoAdicional> findAll();
}
