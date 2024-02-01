package com.test.kosmos.models.repositories;

import com.test.kosmos.models.dal.Citas;
import com.test.kosmos.models.dal.Consultorios;
import com.test.kosmos.models.dal.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CitasRepository extends JpaRepository<Citas, Long> {

    List<Citas> findCitasByConsultoriosAndDoctorAndFechaConsulta(Consultorios consultorio, Doctores doctor, Date fecha);
}
