package ar.edu.unahur.obj.parciales.perfiles;

import java.util.ArrayList;
import java.util.List;

public abstract class TrainingProfile {
    protected final List<Training> suggestedTraining;

    public TrainingProfile() {
        this.suggestedTraining = new ArrayList<>();
    }
    public TrainingProfile(List<Training> suggestedTraining) {
        this.suggestedTraining = new ArrayList<>(suggestedTraining);
    }
    public abstract void addSuggestedTraining(Training aTraining);
}
