package ar.edu.unahur.obj.parciales;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj.parciales.perfiles.TipoEntrenamiento;

public class UsuariosTest {
    @Test
    public void dadoUnUsuarioConPerfilDeTipo_cuandoRecibeEntrenamientoCompatible_entoncesLoAcepta() {
        // Dado
        Usuario usuario = new Usuario();
        usuario.setPerfil(new TipoEntrenamiento(List.of("Cardio", "Spinning")));

        Entrenamiento entrenamiento = new Entrenamiento(
                "Entrenamiento Cardio", 2023, "Cardio", "español", List.of("español"));

        // Cuando
        boolean aceptado = usuario.aceptaSugerencia(entrenamiento);

        // Entonces
        assertTrue(aceptado);
    }

    @Test
    public void dadoUnUsuarioConPerfilDeTipo_cuandoRecibeEntrenamientoNoCompatible_entoncesNoLoAcepta() {
        // Dado
        Usuario usuario = new Usuario();
        usuario.setPerfil(new TipoEntrenamiento(List.of("Yoga")));

        Entrenamiento entrenamiento = new Entrenamiento(
                "Entrenamiento Cardio", 2023, "Cardio", "español", List.of("español"));

        // Cuando
        boolean aceptado = usuario.aceptaSugerencia(entrenamiento);

        // Entonces
        assertFalse(aceptado);
    }

}
