package ar.edu.unahur.obj.parciales;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PlataformaTest {

    @Test
    public void dadoUnEntrenamiento_cuandoSeAgregaAPlataforma_entoncesEstaEnLaListaDeEntrenamientos() {
        // Dado
        Plataforma plataforma = new Plataforma();
        Entrenamiento entrenamiento = new Entrenamiento(
                "Spinning Intenso", 2023, "Spinning", "español", List.of("español"));

        // Cuando
        plataforma.agregarEntrenamiento(entrenamiento);

        // Entonces
        assertTrue(plataforma.getEntrenamientos().contains(entrenamiento));
    }

    @Test
    public void dadoUnEntrenamiento_cuandoSeQuitaDeLaPlataforma_entoncesYaNoEstaEnLaListaDeEntrenamientos() {
        // Dado
        Plataforma plataforma = new Plataforma();
        Entrenamiento entrenamiento = new Entrenamiento(
                "Spinning Intenso", 2023, "Spinning", "español", List.of("español"));

        plataforma.agregarEntrenamiento(entrenamiento);

        // Cuando
        plataforma.quitarEntrenamiento(entrenamiento);

        // Entonces
        assertFalse(plataforma.getEntrenamientos().contains(entrenamiento));
    }

    @Test
    public void dadoUnUsuario_cuandoSeAgregaAPlataforma_entoncesEstaEnLaListaDeUsuarios() {
        // Dado
        Plataforma plataforma = new Plataforma();
        Usuario usuario = new Usuario();

        // Cuando
        plataforma.agregarUsuario(usuario);

        // Entonces
        assertTrue(plataforma.getUsuarios().contains(usuario));
    }

    @Test
    public void dadoUnUsuario_cuandoSeQuitaDePlataforma_entoncesYaNoEstaEnLaListaDeUsuarios() {
        // Dado
        Plataforma plataforma = new Plataforma();
        Usuario usuario = new Usuario();

        plataforma.agregarUsuario(usuario);

        // Cuando
        plataforma.quitarUsuario(usuario);

        // Entonces
        assertFalse(plataforma.getUsuarios().contains(usuario));
    }

}
