package week_9.lesson3_FinalExam;

public abstract class Carga {
    private String nombre;
    private String descripcion;

    public Carga(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Double calcularPeso();

}
