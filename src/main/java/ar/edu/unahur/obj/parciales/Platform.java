package ar.edu.unahur.obj.parciales;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    private final List<User> users = new ArrayList<>();
    private final List<Training> trainings = new ArrayList<>();

    public void addTraining(Training t) { trainings.add(t); }
    public void removeTraining(Training t) { trainings.remove(t); }
    public void addUser(User u) { users.add(u); }
    public void removeUser(User u) { users.remove(u); }

    public void performSuggestionProcess() {
        users.forEach(user ->
            trainings.forEach(training -> {
                if (user.acceptsSuggestionFor(training)) {
                    user.addSuggestedTraining(training);
                }
            })
        );
    }
    public List<Training> getTrainings() {
        return this.trainings;
    }
}