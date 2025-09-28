package ar.edu.unahur.obj.parciales.perfiles;

import ar.edu.unahur.obj.parciales.Entrenamiento;

public class NivelModerno implements PerfilStrategy {
    private Integer desdeElAnio;

    public NivelModerno(Integer desdeElAnio) {
        this.desdeElAnio = desdeElAnio;
    }

    @Override
    public Boolean aceptaSugerencia(Entrenamiento entrenamiento) {
        return Boolean.valueOf(entrenamiento.getAnioCreacion() >= desdeElAnio);
    }

}
