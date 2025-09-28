package ar.edu.unahur.obj.parciales;

import java.util.HashSet;
import java.util.Set;

public class Plataforma {
    public Set<Entrenamiento> getEntrenamientos() {
        return new HashSet<>(entrenamientos);
    }

    public Set<Usuario> getUsuarios() {
        return new HashSet<>(usuarios);
    }

    private Set<Entrenamiento> entrenamientos = new HashSet<>();
    private Set<Usuario> usuarios = new HashSet<>();

    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
        entrenamientos.add(entrenamiento);
    }

    public void quitarEntrenamiento(Entrenamiento entrenamiento) {
        entrenamientos.remove(entrenamiento);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void quitarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void sugerencia() {
        entrenamientos.stream().forEach(entrenamiento -> {
            usuarios.stream().forEach(usuario -> {
                if (usuario.aceptaSugerencia(entrenamiento)) {
                    usuario.agregarEntrenamientoSugerido(entrenamiento);
                }
            });
        });
    }
}
