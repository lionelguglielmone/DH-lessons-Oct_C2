package week_7.lesson3;

public class Presupuesto implements StateArticulo {
    private Articulo articulo;

    public Presupuesto(Articulo articulo){
        this.articulo = articulo;
    }


    public void cambiarDireccion(String direccion){
        System.out.println("Todavia no puede modificar la direccion");
    }
    public void darValorPresupuesto(Double presupuesto){
        this.articulo.setCosto(presupuesto);
        System.out.println("Presupuesto pendiente de aprobacion");

    }
    public void agregarRepuesto(Double costoRepuesto){
        System.out.println("No se pueden agregar respuesto sin haber aprobado " +
                "el presupuesto pendiente");
    }
    public void siguientePaso(StateArticulo estado){
        System.out.println("Articulo" + this.articulo.getNombre());
        System.out.println("Estado" + this.articulo.getEstado().getClass());
        System.out.println("CostoActual" + this.articulo.getCosto());
        this.articulo.setEstado(new Reparacion(this.articulo));
    }
}
