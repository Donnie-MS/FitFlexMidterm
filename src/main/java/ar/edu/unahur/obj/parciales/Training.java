package ar.edu.unahur.obj.parciales;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Training {
    private final String name;
    private final Integer yearOfCreation;
    private final String typeOfTraining;
    private final String languageOfTheInstructor;
    private final List<String> availableAudios = new ArrayList<>();

    public Training(String name, Integer yearOfCreation, String typeOfTraining, String languageOfTheInstructor) {
        this.name = Objects.requireNonNull(name);
        this.yearOfCreation = Objects.requireNonNull(yearOfCreation);
        this.typeOfTraining = Objects.requireNonNull(typeOfTraining);
        this.languageOfTheInstructor = Objects.requireNonNull(languageOfTheInstructor);
    }

    public String getName() {return name; }
    public Integer getYear() { return yearOfCreation; }
    public String getTypeOfTraining() { return typeOfTraining; }
    public String getInstructorLanguage() { return languageOfTheInstructor; }
    public List<String> getAvailableAudios() { return List.copyOf(availableAudios); }

    public void addAudio(String lang) { availableAudios.add(lang); }

    public boolean narratedInOriginalLanguage() {
        return availableAudios.stream().anyMatch(lang -> lang.equals(languageOfTheInstructor));
    }
}