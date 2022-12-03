package week_7.lesson3;

public class ParaEnvio implements StateArticulo {
    private Articulo articulo;


    public ParaEnvio(Articulo articulo) {
        this.articulo = articulo;
    }

    public void cambiarDireccion(String direccion){
        this.articulo.setDireccion(direccion);
    }
    public void darValorPresupuesto(Double presupuesto){
        System.out.println("El presupuesto ya ha sido asignado");

    }
    public void agregarRepuesto(Double costoRepuesto){
        System.out.println("No se pueden agreagr repuestos");

    }
    public void siguientePaso(StateArticulo estado){
        System.out.println("Articulo" + this.articulo.getNombre());
        System.out.println("Estado" + this.articulo.getEstado().getClass());
        System.out.println("CostoActual" + this.articulo.getCosto());
        this.articulo.setEstado(new Finalizado(this.articulo));
    }
}
