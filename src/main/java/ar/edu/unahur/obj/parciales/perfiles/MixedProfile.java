package ar.edu.unahur.obj.parciales.perfiles;

import java.util.List;

import ar.edu.unahur.obj.parciales.Training;

public class MixedProfile implements TrainingProfile {
    private final List<TrainingProfile> profiles;

    public MixedProfile(List<TrainingProfile> profiles) {
        if (profiles == null || profiles.isEmpty())
            throw new IllegalArgumentException("AL MNEOS UN PERFIL");
        this.profiles = List.copyOf(profiles);
    }

    @Override
    public boolean accepts(Training t) {
        return profiles.stream().anyMatch(p -> p.accepts(t));
    }
}