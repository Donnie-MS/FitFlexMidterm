package ar.edu.unahur.obj.parciales;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj.parciales.perfiles.ModernLevel;

public class PlatformTest {
    @Test
    void dadoUnUsuarioYUnEntrenamientoCompatible_cuandoSeEjecutaSugerenciaEntrenamientoentoncesEsSugeridoAlUsuarioyloacpeta() {
        User user1 = new User("usuario@gmail.com", new ModernLevel(2019));
        Training training = new Training("Yoga", 2020, "Cardio", "Español");

        Platform fitnessPlatform = new Platform();

        fitnessPlatform.addUser(user1);
        fitnessPlatform.addTraining(training);

        fitnessPlatform.performSuggestionProcess();

        assertTrue(user1.getSuggestedTrainings().contains(training));
    }

    @Test
    void dadoUnEntrenamiento_cuandoSeQuitaDeLaPlataforma_entoncesYaNoEstaEnLaListaDeEntrenamientos() {
        Platform fitnesPlatform = new Platform();
        Training training = new Training("Yoga", 2020, "Cardio", "Español");
        
        fitnesPlatform.addTraining(training);
        fitnesPlatform.removeTraining(training);

        assertTrue(fitnesPlatform.getTrainings().isEmpty());
    }
}
