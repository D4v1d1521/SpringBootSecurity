package com.david.tallerSecurity.model.Core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "info-adicional")
public class InfoAdicional implements Serializable {


    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String idioma;

    @Column(name = "fecha-publicacion")
    private Date fechaPublicacion;

    @OneToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;


    @PrePersist
    public void prePersit(){
        this.fechaPublicacion = new Date();
    }

    public InfoAdicional(Integer id, String idioma, Date fechaPublicacion) {
        this.id = id;
        this.idioma = idioma;
        this.fechaPublicacion = fechaPublicacion;
    }

    public InfoAdicional() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
