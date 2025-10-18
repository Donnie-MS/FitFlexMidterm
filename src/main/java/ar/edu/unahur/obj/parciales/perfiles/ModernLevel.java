package ar.edu.unahur.obj.parciales.perfiles;


public class ModernLevel implements TrainingProfile {
    private final int year;

    public ModernLevel(int year) { this.year = year; }

    @Override
    public boolean accepts(Training t) {
        return t.getYear() >= year;
    }
}
