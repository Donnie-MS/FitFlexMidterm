package ar.edu.unahur.obj.parciales.perfiles;

import java.util.List;

public class TypeOfTraining extends TrainingProfile{
    private Training trainingType;
    public TypeOfTraining(List<Training> suggestedTraining, Training trainingType) {
        super(suggestedTraining);
        this.trainingType = trainingType;
    }

    //aceptar si  pirmero es sugerido y si quiere el ususario
    public void addSuggestedTraining(Training aTraining) {
        if (trainingType.equals(aTraining)) {
            this.suggestedTraining.add(aTraining);
        }
    }
}
