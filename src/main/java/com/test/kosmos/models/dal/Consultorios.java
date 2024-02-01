package com.test.kosmos.models.dal;


import jakarta.persistence.*;

@Entity
@Table(name = "consultorios")
public class Consultorios{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long numeroConsultorio;

    @Column
    private Integer numeroPiso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(Long numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
}
