package ar.edu.unahur.obj.parciales;

import ar.edu.unahur.obj.parciales.perfiles.Training;
import ar.edu.unahur.obj.parciales.perfiles.TrainingProfile;
import ar.edu.unahur.obj.parciales.perfiles.TypeOfTraining;

import java.util.*;

public class User {
    private final String mail;
    private TrainingProfile fitnessProfile;
    private final List<Training> suggested = new ArrayList<>();

    public User(String mail, TrainingProfile fitnessProfile) {
        this.mail = Objects.requireNonNull(mail);
        this.fitnessProfile = (fitnessProfile != null) ? fitnessProfile
                : new TypeOfTraining(Set.of("Caminar"));
    }

    public TrainingProfile getFitnessProfile() { return fitnessProfile; }
    public void setFitnessProfile(TrainingProfile profile) { this.fitnessProfile = Objects.requireNonNull(profile); }

    public boolean acceptsSuggestionFor(Training t) { return fitnessProfile.accepts(t); }

    public void addSuggestedTraining(Training t) {
        if (!suggested.contains(t)) suggested.add(t);
    }

    public List<Training> getSuggestedTrainings() { return List.copyOf(suggested); }
}