package week_7.lesson3;

public interface StateArticulo {

    void cambiarDireccion(String direccion);
    void darValorPresupuesto(Double presupuesto);
    void agregarRepuesto(Double costoRepuesto);
    void siguientePaso(StateArticulo estado);
}
