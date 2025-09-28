package ar.edu.unahur.obj.parciales.perfiles;

import ar.edu.unahur.obj.parciales.Entrenamiento;

public class AudioIdiomaOriginal implements PerfilStrategy {

    @Override
    public Boolean aceptaSugerencia(Entrenamiento entrenamiento) {
        return entrenamiento.esNarradoEnIdiomaOriginal();
    }

}
