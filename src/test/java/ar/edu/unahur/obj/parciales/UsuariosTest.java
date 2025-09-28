package ar.edu.unahur.obj.parciales;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    public void dadoUnUsuario_cuandoAgregaEntrenamientoASugeridos_entoncesPuedeRealizarlo() {
        // Dado
        Usuario usuario = new Usuario();

        Entrenamiento entrenamiento = new Entrenamiento(
                "Entrenamiento Spinning", 2024, "Spinning", "inglés", List.of("inglés"));

        // Cuando
        usuario.agregarEntrenamientoSugerido(entrenamiento);

        // Entonces
        assertDoesNotThrow(() -> usuario.realizarEntrenamientoSugerido());
    }

    @Test
    public void dadoUnUsuarioConEntrenamientoSugerido_cuandoLoRealiza_entoncesSeAgregaALosRealizados() {
        // Dado
        Usuario usuario = new Usuario();

        Entrenamiento entrenamiento = new Entrenamiento(
                "Entrenamiento Caminata", 2020, "Caminata", "español", List.of("español"));

        usuario.agregarEntrenamientoSugerido(entrenamiento);

        // Cuando
        usuario.realizarEntrenamientoSugerido();

        // Entonces
        assertDoesNotThrow(() -> usuario.realizarEntrenamientoSugerido());
    }

    @Test
    public void dadoUnUsuarioSinEntrenamientosSugeridos_cuandoIntentaRealizarUno_entoncesLanzaExcepcion() {
        // Dado
        Usuario usuario = new Usuario();

        // Cuando / Entonces
        assertThrows(RuntimeException.class, () -> usuario.realizarEntrenamientoSugerido());
    }

}
