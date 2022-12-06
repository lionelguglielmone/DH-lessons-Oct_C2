package week_8.lesson1;

import java.util.ArrayList;

public class Combo implements Comanda {
    private ArrayList<Producto> productos;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }

    @Override
    public Double getPrecio() {
        Double totalSinDescuento = 0.0;
        for (Producto producto: this.productos) {
            totalSinDescuento += producto.getPrecio();
        }
        Double totalConDescuentoAplicado = totalSinDescuento*(1-this.descuento);
        return totalConDescuentoAplicado;
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
}
