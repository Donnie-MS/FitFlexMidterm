package ar.edu.unahur.obj.parciales.perfiles;

public class WithOriginalAudio implements TrainingProfile {
    @Override
    public boolean accepts(Training t) {
        return t.narratedInOriginalLanguage();
    }
}