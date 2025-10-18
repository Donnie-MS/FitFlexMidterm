package ar.edu.unahur.obj.parciales.perfiles;

import java.util.Set;

import ar.edu.unahur.obj.parciales.Training;

public class TypeOfTraining implements TrainingProfile {
    private final Set<String> acceptedTypes;

    public TypeOfTraining(Set<String> acceptedTypes) {
        this.acceptedTypes = Set.copyOf(acceptedTypes);
    }

    @Override
    public boolean accepts(Training t) {
        return acceptedTypes.contains(t.getTypeOfTraining());
    }
}