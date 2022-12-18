package week_9.lesson3_FinalExam;

import java.util.ArrayList;

public class CargaContenedor extends Carga {
    private ArrayList<CargaSimple> cargasSimples = new ArrayList<>();
    private Double pesoContenedor;

    public CargaContenedor(String nombre, Double pesoContenedor) {
        super(nombre);
        this.pesoContenedor = pesoContenedor;
    }

    @Override
    public Double calcularPeso(){
        Double totalPesoContenidoDelContenedor = 0.0;
        for (CargaSimple cargaSimple: this.cargasSimples) {
            totalPesoContenidoDelContenedor += cargaSimple.calcularPeso();
        }
        return totalPesoContenidoDelContenedor + this.pesoContenedor;
    }

    public void agregarCargaSimple(CargaSimple cargaSimple) {
        this.cargasSimples.add(cargaSimple);
    }

}
