package com.test.kosmos.models.dal;



import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Doctores doctor;

    @ManyToOne
    private Consultorios consultorios;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConsulta;

    @Column
    private String paciente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

    public Consultorios getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(Consultorios consultorios) {
        this.consultorios = consultorios;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}
