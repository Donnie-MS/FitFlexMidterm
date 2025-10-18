package ar.edu.unahur.obj.parciales.perfiles;

import java.util.ArrayList;
import java.util.List;

public class Training {
    private String name;
    private Integer yearOfCreation;
    private String typeOfTraining;
    private String languageOfTheInstructor;
    private List<String> availableAudios;

    public Training(String name, Integer yearCreation, String typeOfTraining, String languageOfTheInstructor) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.typeOfTraining = typeOfTraining;
        this.languageOfTheInstructor = languageOfTheInstructor;
        this.availableAudios = new ArrayList<>();
    }

    public Integer getYear() {
        return this.yearOfCreation;
    }

    public Boolean hasTheOriginalAudio() {
        return availableAudios.stream().anyMatch(audio -> audio == this.languageOfTheInstructor);
    }

}
