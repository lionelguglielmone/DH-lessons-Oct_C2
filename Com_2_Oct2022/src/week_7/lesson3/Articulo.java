package week_7.lesson3;

public class Articulo {
    private StateArticulo estado;
    private String nombre;
    private Double costo;
    private String direccion;

    public Articulo(String nombre) {
        this.nombre = nombre;
        this.estado = new Presupuesto(this);
        this.costo = 0.0;
    }

    public void cambiarDireccion(String direccion){
        this.estado.cambiarDireccion(direccion);
    }
    public void darValorPresupuesto(Double presupuesto){
        this.estado.darValorPresupuesto(presupuesto);
    }
    public void agregarRepuesto(Double costoRepuesto){
        this.estado.agregarRepuesto(costoRepuesto);
    }
    public void siguientePaso(StateArticulo estado){
        this.estado.siguientePaso(estado);
    }

    //getters and setters


    public StateArticulo getEstado() {
        return estado;
    }

    public void setEstado(StateArticulo estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
