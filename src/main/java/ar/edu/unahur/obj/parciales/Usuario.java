package ar.edu.unahur.obj.parciales;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unahur.obj.parciales.perfiles.PerfilStrategy;
import ar.edu.unahur.obj.parciales.perfiles.TipoEntrenamiento;

public class Usuario {
    private String email;
    private Set<Entrenamiento> entrenamientoSugerido = new HashSet<>();
    private PerfilStrategy perfil = new TipoEntrenamiento(List.of("Caminata"));

    public String getEmail() {
        return email;
    }

    public void setPerfil(PerfilStrategy perfil) {
        this.perfil = perfil;
    }

    public Boolean aceptaSugerencia(Entrenamiento entrenamiento) {
        return perfil.aceptaSugerencia(entrenamiento);
    }

    public void agregarEntrenamientoSugerido(Entrenamiento entrenamiento) {
        entrenamientoSugerido.add(entrenamiento);
    }

}
