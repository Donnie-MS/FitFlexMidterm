package ar.edu.unahur.obj.parciales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EntrenamientoTest {
    @Test
    void dadoUnEntrenamientoQueLePongoUnNombre_SeVerificaQueElNombreEsCorrecto() {
        Entrenamiento entrenamiento = new Entrenamiento("Yoga");
        assertEquals("Yoga", entrenamiento.getNombre());
    }
}
