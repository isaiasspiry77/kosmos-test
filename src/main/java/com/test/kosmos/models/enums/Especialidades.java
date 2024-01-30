package com.test.kosmos.models.enums;

public enum Especialidades {

    ESPECIALIDAD_GASTROENTEROLOGO("GASTROENTEROLOGO"),
    ESPECIALIDAD_OFTALMOLOGO("OFTALMOLOGO"),
    ESPECIALIDAD_GINECOLOGO("USER");

    public final String value;

    Especialidades(String value) {
        this.value = value;
    }
}
