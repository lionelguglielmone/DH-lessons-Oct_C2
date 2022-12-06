package week_8.lesson1;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Comanda> comandas;

    public Carrito(){
        this.comandas = new ArrayList<>();
    }

    public void mostrarCompra(){
        for (Comanda comanda: this.comandas) {
            //System.out.println(comanda); pending!!!!!!
        }
    }

    public Double obtenerTotal() {
        Double total = 0.0;
        for (Comanda comanda : this.comandas){
            total += comanda.getPrecio();
        }
        return total;
    }

    public void agregarComanda(Comanda c) {
        this.comandas.add(c);
    }

}
