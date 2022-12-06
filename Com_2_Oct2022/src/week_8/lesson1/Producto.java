package week_8.lesson1;

public class Producto implements Comanda {
    private String nombre;
    private Double precio;


    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public Double getPrecio() {
        return this.precio;
    }
}
