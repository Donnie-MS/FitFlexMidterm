package ar.edu.unahur.obj.parciales.perfiles;

import ar.edu.unahur.obj.parciales.Training;

public class WithOriginalAudio implements TrainingProfile {
    @Override
    public boolean accepts(Training t) {
        return t.narratedInOriginalLanguage();
    }
}