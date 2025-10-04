package ar.edu.unahur.obj.parciales.perfiles;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj.parciales.Entrenamiento;

public class Mixto implements PerfilStrategy {
    private List<PerfilStrategy> perfiles = new ArrayList<>();

    public Mixto(List<PerfilStrategy> perfiles) {
        this.perfiles = perfiles;
    }

    @Override
    public Boolean aceptaSugerencia(Entrenamiento entrenamiento) {
        return perfiles.stream().anyMatch(perfil -> perfil.aceptaSugerencia(entrenamiento));
    }

}
