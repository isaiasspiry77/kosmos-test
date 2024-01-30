package com.test.kosmos.services;

import com.test.kosmos.models.dal.Citas;
import com.test.kosmos.models.dal.Consultorios;
import com.test.kosmos.models.dal.Doctores;
import com.test.kosmos.models.repositories.CitasRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class CitasService {

    private static final Logger logger = LoggerFactory.getLogger(CitasService.class);

    private CitasRepository citasRepository;


    public ResponseEntity<Object> altaCita(Citas cita) {

        try {

            var doctor = cita.getDoctor();

            if (doctor == null) {
                return generateResponse(
                        "Información del doctor requerida",
                        null,
                        HttpStatus.BAD_REQUEST
                );
            }

            var consultorio = cita.getConsultorios();

            if (consultorio == null) {
                return generateResponse(
                        "Información del consultorio requerida",
                        null,
                        HttpStatus.BAD_REQUEST
                );
            }


            if((cita.getFechaConsulta() == null && cita.getPaciente() == null) || (cita.getFechaConsulta() == null || cita.getPaciente() == null)){

                return generateResponse(
                        "el nombre del paciente y la fecha y hora son requeridos ",
                        null,
                        HttpStatus.BAD_REQUEST
                );
            }

            var validacion = validateHorario(cita, doctor, consultorio);
            
            if(validacion != null) return validacion;

        }catch (Exception e){

            return generateResponse(
                    "error interno",
                    null,
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }

        return null;
    }

    private ResponseEntity<Object> validateHorario(Citas cita, Doctores doctor, Consultorios consultorio) {

        var citasPorFechaHora = citasRepository.findCitasByConsultoriosAndDoctorAndFechaConsulta(consultorio, doctor, cita.getFechaConsulta());

        return null;
    }

    public ResponseEntity<Object> generateResponse(String message, Object object, HttpStatus httpStatus) {

        Map<String, Object> response = new LinkedHashMap<>();

        if(object != null){

            response.put("response", object);
        }

        response.put("message", message);

        return new ResponseEntity<>(response, httpStatus);
    }
    @Autowired
    public void setCitasRepository(CitasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }
}
