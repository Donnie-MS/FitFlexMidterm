package ar.edu.unahur.obj.parciales.perfiles;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj.parciales.Entrenamiento;

public class TipoEntrenamiento implements PerfilStrategy {
    private List<String> tipoEntrenamientosAcepta = new ArrayList<>();

    public TipoEntrenamiento(List<String> tipoEntrenamientosAcepta) {
        this.tipoEntrenamientosAcepta = tipoEntrenamientosAcepta;
    }

    @Override
    public Boolean aceptaSugerencia(Entrenamiento entrenamiento) {
        return tipoEntrenamientosAcepta.contains(entrenamiento.getTipoEntrenamiento());
    }

}
