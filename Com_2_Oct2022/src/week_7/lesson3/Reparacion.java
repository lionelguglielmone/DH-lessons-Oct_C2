package week_7.lesson3;

public class Reparacion implements StateArticulo {
    private Articulo articulo;

    public Reparacion(Articulo articulo) {
        this.articulo = articulo;
    }

    public void cambiarDireccion(String direccion){
        System.out.println("Todavia no puede modificar la direccion");

    }
    public void darValorPresupuesto(Double presupuesto){
        System.out.println("El presupuesto ya ha sido asignado");
    }
    public void agregarRepuesto(Double costoRepuesto){
        Double costoPresupuesto = this.articulo.getCosto();
        Double costoPresupuestoConRepuestoAgregado = costoPresupuesto + costoRepuesto;
        this.articulo.setCosto(costoPresupuestoConRepuestoAgregado);
    }
    public void siguientePaso(StateArticulo estado){
        System.out.println("Articulo" + this.articulo.getNombre());
        System.out.println("Estado" + this.articulo.getEstado().getClass());
        System.out.println("CostoActual" + this.articulo.getCosto());
        this.articulo.setEstado(new ParaEnvio(this.articulo));
    }

}
