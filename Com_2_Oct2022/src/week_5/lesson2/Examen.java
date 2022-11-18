package week_5.lesson2;

public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private Double nota;

    public Examen(Double nota) {
        this.nota = nota;
    }

    public Double getNota(){
        return this.nota;
    }

    public abstract Boolean estaAprobado();
}
