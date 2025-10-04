package ar.edu.unahur.obj.parciales;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj.parciales.perfiles.AudioIdiomaOriginal;
import ar.edu.unahur.obj.parciales.perfiles.Mixto;
import ar.edu.unahur.obj.parciales.perfiles.NivelModerno;
import ar.edu.unahur.obj.parciales.perfiles.PerfilStrategy;
import ar.edu.unahur.obj.parciales.perfiles.TipoEntrenamiento;

public class EntrenamientoTest {

    @Test
    public void dadoUnEntrenamientoDeUnTipo_cuandoSeEvaluaPerfilPorUnTipoAceptado_entoncesEsAceptado() {
        // Dado
        Entrenamiento entrenamientoCardio = new Entrenamiento("Durisimo", 2024, "Cardio", "español",
                List.of("español"));
        PerfilStrategy perfil = new TipoEntrenamiento(Arrays.asList("Crossfit", "Cardio", "Spinning"));

        // Cuando
        boolean aceptado = perfil.aceptaSugerencia(entrenamientoCardio);

        // Entonces
        assertTrue(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoDeUnTipo_cuandoSeEvaluaPerfilPorUnTipoNOAceptado_entoncesNOEsAceptado() {
        // Dado
        Entrenamiento entrenamientoCardio = new Entrenamiento("Durisimo", 2024, "Cardio", "español",
                List.of("español"));

        PerfilStrategy perfil = new TipoEntrenamiento(Arrays.asList("Yoga", "Caminata"));

        // Cuando
        boolean aceptado = perfil.aceptaSugerencia(entrenamientoCardio);

        // Entonces
        assertFalse(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoModerno_cuandoSeEvaluaConPerfilDeNivelAnterior_entoncesEsAceptado() {
        // Dado
        PerfilStrategy perfil = new NivelModerno(2020); // Entrenamientos desde 2020 en adelante
        Entrenamiento entrenamientoModerno = new Entrenamiento("Cardio Duro", 2024, "Cardio", "español",
                List.of("español"));

        // Cuando
        boolean aceptado = perfil.aceptaSugerencia(entrenamientoModerno);

        // Entonces
        assertTrue(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoViejo_cuandoSeEvaluaConPerfilDeNivelReciente_entoncesNoEsAceptado() {
        // Dado
        PerfilStrategy perfil = new NivelModerno(2020); // Entrenamientos desde 2020 en adelante
        Entrenamiento entrenamientoViejo = new Entrenamiento("Pilates Básico", 2018, "Pilates", "español",
                List.of("español"));

        // Cuando
        boolean aceptado = perfil.aceptaSugerencia(entrenamientoViejo);

        // Entonces
        assertFalse(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoNarradoEnSuIdiomaOriginal_cuandoSeEvaluaConPerfilAudioOriginal_entoncesEsAceptado() {
        // Dado
        PerfilStrategy perfil = new AudioIdiomaOriginal();
        Entrenamiento entrenamientoNarradoEnOriginal = new Entrenamiento(
                "Cardio Duro", 2024, "Cardio", "español", List.of("español", "inglés"));

        // Cuando
        boolean aceptado = perfil.aceptaSugerencia(entrenamientoNarradoEnOriginal);

        // Entonces
        assertTrue(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoNONarradoEnSuIdiomaOriginal_cuandoSeEvaluaConPerfilAudioOriginal_entoncesNOEsAceptado() {
        // Dado
        PerfilStrategy perfil = new AudioIdiomaOriginal();
        Entrenamiento entrenamientoSinAudioOriginal = new Entrenamiento(
                "Yoga Relax", 2023, "Yoga", "francés", List.of("inglés", "español"));

        // Cuando
        boolean aceptado = perfil.aceptaSugerencia(entrenamientoSinAudioOriginal);

        // Entonces
        assertFalse(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoAceptadoPorAlMenosUnPerfil_cuandoSeEvaluaConPerfilMixto_entoncesEsAceptado() {
        // Dado
        Entrenamiento entrenamiento = new Entrenamiento(
                "Cardio Duro", 2024, "Cardio", "español", List.of("inglés"));

        PerfilStrategy tipoNoAceptado = new TipoEntrenamiento(List.of("Yoga", "Spinning")); // OK
        PerfilStrategy modernoAceptado = new NivelModerno(2020); // OK
        PerfilStrategy audioNoAceptado = new AudioIdiomaOriginal(); // NO OK - no está narrado en español

        PerfilStrategy perfilMixto = new Mixto(List.of(tipoNoAceptado, modernoAceptado, audioNoAceptado));

        // Cuando
        boolean aceptado = perfilMixto.aceptaSugerencia(entrenamiento);

        // Entonces
        assertTrue(aceptado);
    }

    @Test
    public void dadoUnEntrenamientoNoAceptadoPorNingunPerfil_cuandoSeEvaluaConPerfilMixto_entoncesNOEsAceptado() {
        // Dado
        Entrenamiento entrenamiento = new Entrenamiento(
                "Yoga Antiguo", 2015, "Yoga", "francés", List.of("español"));

        PerfilStrategy tipoNoAceptado = new TipoEntrenamiento(List.of("Cardio", "Spinning")); // NO ok Yoga
        PerfilStrategy noModerno = new NivelModerno(2020); // es de 2015
        PerfilStrategy audioNoAceptado = new AudioIdiomaOriginal(); // idioma original: francés, no está en la lista

        PerfilStrategy perfilMixto = new Mixto(List.of(tipoNoAceptado, noModerno, audioNoAceptado));

        // Cuando
        boolean aceptado = perfilMixto.aceptaSugerencia(entrenamiento);

        // Entonces
        assertFalse(aceptado);
    }

}
