package week_8.practiceFinal;

import java.util.ArrayList;

public class Jugueteria {
    private ArrayList<Juguete> catalogo;
    private String nombre;

    public Jugueteria(String nombre) {
        this.nombre = nombre;
        this.catalogo = new ArrayList<>();
    }

    public void agregarJugueteACatalogo(Juguete juguete) {
        this.catalogo.add(juguete);
    }

    public void mostrarCatalogo(){
        for(Juguete juguete: this.catalogo) {
            System.out.println("Codigo QR: " + juguete.getQr());
            System.out.println("Detalle: " + juguete.getDetalle());
            System.out.println("Precio: " + juguete.calcularPrecio());
        }
    }
}
