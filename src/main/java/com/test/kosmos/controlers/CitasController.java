package com.test.kosmos.controlers;

import com.test.kosmos.models.dal.Citas;
import com.test.kosmos.services.CitasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citas")
public class CitasController {

    private static final Logger logger = LoggerFactory.getLogger(CitasController.class);

    private CitasService citasService;

    @PostMapping("/alta")
    public ResponseEntity<Object> altaCita(@RequestBody Citas cita){

        return citasService.altaCita(cita);
    }

    @Autowired
    public void setCitasService(CitasService citasService) {
        this.citasService = citasService;
    }
}
