package com.test.kosmos.models.repositories;

import com.test.kosmos.models.dal.Citas;
import com.test.kosmos.models.dal.Consultorios;
import com.test.kosmos.models.dal.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CitasRepository extends JpaRepository<Citas, Long> {

    List<Citas> findCitasByConsultoriosAndDoctorAndFechaConsulta(Consultorios consultorio, Doctores doctor, Date fecha);
}
