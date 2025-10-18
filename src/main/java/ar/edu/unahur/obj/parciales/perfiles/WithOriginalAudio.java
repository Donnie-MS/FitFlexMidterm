package ar.edu.unahur.obj.parciales.perfiles;

import java.util.List;

public class WithOriginalAudio extends TrainingProfile{
    public WithOriginalAudio(List<Training> suggestedTraining) {
        super(suggestedTraining);
    }

    @Override
    public void addSuggestedTraining(Training aTraining) {
        if(aTraining.hasTheOriginalAudio()) {
            suggestedTraining.add(aTraining);
        }
    }
}
