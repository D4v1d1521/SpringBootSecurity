package com.david.tallerSecurity.repository.Core;


import com.david.tallerSecurity.model.Core.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, Integer> {

    @Query(value = "select * from libros where titulo = ?", nativeQuery = true)
    public List<Libro> findByNombre(String titulo);

    List<Libro> findAll();
    List<Libro> findByAutorNombre(String nombreAutor);


}
