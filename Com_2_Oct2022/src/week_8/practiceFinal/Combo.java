package week_8.practiceFinal;

import java.util.ArrayList;

public class Combo extends Juguete{
    private ArrayList<Individual> juguetes;
    private Double bonificacion;

    public Combo(String qr, String detalle, Double bonificacion) {
        super(qr, detalle);
        this.bonificacion = bonificacion;
        this.juguetes = new ArrayList<>();
    }

    public void agregarJuguete(Individual ind) {
        this.juguetes.add(ind);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotalSinBonificacion = 0.0;
        for(Individual individual: this.juguetes){
            precioTotalSinBonificacion += individual.calcularPrecio();
        }
        Double precioConBonificacion = precioTotalSinBonificacion*(1-this.bonificacion);
        return precioConBonificacion;
    }
}
