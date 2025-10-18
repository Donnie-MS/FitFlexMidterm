package ar.edu.unahur.obj.parciales;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj.parciales.Training;
import ar.edu.unahur.obj.parciales.User;
import ar.edu.unahur.obj.parciales.perfiles.ModernLevel;

public class UserTest {

    @Test
    void dadoUnUsuarioConPerfilDeTipo_cuandoRecibeEntrenamientoCompatible_entoncesLoAcepta() {
        User user1 = new User("usuario@gmail.com", new ModernLevel(2020));
        
        Training training = new Training("Yoga", 2020, "Cardio", "Español");

        assertTrue(user1.acceptsSuggestionFor(training));
    }
}
