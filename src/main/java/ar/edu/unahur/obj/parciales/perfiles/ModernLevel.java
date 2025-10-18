package ar.edu.unahur.obj.parciales.perfiles;

import java.util.List;

public class ModernLevel extends TrainingProfile{
    private Integer year;
    public ModernLevel(List<Training> suggestedTraining, Integer year) {
        super(suggestedTraining);
        this.year = year;
    }

    @Override
    public void addSuggestedTraining(Training aTraining) {
        if (aTraining.getYear() >= this.year ) {
            this.suggestedTraining.add(aTraining);
        }
    }
}
