package ar.edu.unahur.obj.parciales;

import java.util.List;

public class Entrenamiento {
    private String nombre;
    private Integer anioCreacion;
    private String tipoEntrenamiento;
    private String idiomaInstructor;
    private List<String> audios;

    public Entrenamiento(String nombre, Integer anioCreacion, String tipoEntrenamiento, String idiomaInstructor,
            List<String> audios) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.tipoEntrenamiento = tipoEntrenamiento;
        this.idiomaInstructor = idiomaInstructor;
        this.audios = audios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Integer anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }

    public void setTipoEntrenamiento(String tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    public String getIdiomaInstructor() {
        return idiomaInstructor;
    }

    public void setIdiomaInstructor(String idiomaInstructor) {
        this.idiomaInstructor = idiomaInstructor;
    }

    public List<String> getAudios() {
        return audios;
    }

    public void setAudios(List<String> audios) {
        this.audios = audios;
    }

    public Boolean esNarradoEnIdiomaOriginal() {
        return audios.contains(idiomaInstructor);
    }

}
