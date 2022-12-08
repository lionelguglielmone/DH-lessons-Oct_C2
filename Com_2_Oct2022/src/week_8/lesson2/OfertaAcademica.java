package week_8.lesson2;

public abstract class OfertaAcademica {

    private String nombre;
    private String descripcion;


    public OfertaAcademica(String nombre) {
        this.nombre = nombre;
    }


    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}