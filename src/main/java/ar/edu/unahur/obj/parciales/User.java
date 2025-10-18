package ar.edu.unahur.obj.parciales;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj.parciales.perfiles.Training;
import ar.edu.unahur.obj.parciales.perfiles.TrainingProfile;

public class User {
//asociado a un perfil
    private String mail;
    private TrainingProfile fitnessProfile;
    private final List<Training> suggestedTraining;

    public User(String mail, TrainingProfile fitnessProfile) {
        this.mail = mail;
        this.fitnessProfile = fitnessProfile;
        this.suggestedTraining = new ArrayList<>();
    }

    public void addSuggestedTraining(Training aTraining) {

    }

    public void removeSuggestedTraining(Training aTraining) {
        
    }
}
