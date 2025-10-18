package ar.edu.unahur.obj.parciales;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj.parciales.perfiles.Training;

public class Platform {
    private final List<User> users;
    private final List<Training> trainings;

    public Platform() {
        this.users = new ArrayList<>();
        this.trainings = new ArrayList<>();
    }

    public Platform(List<User> users, List<Training> trainings) {
        this.users = users;
        this.trainings = trainings;
    }

    public void addTraining(Training aTraining) {
        this.trainings.add(aTraining);
    }
    
    public void addUser(User aUser) {
        this.users.add(aUser);
    }

    public void removeTraining(Training aTraining) {
        this.trainings.remove(aTraining);
    }

    public void removeUser(User aUser) {
        this.users.remove(aUser);
    }
}
/*
 Además la plataforma debe tener la funcionalidad de realizar un proceso 
 de sugerencia que consiste en evaluar cada entrenamiento contra el perfil
  fitness de cada usuario, y en el caso de que el usuario acepta la sugerencia
   de entrenamiento debe sumarlo a la lista de entrenamientos sugeridos.
 */