package week_9.lesson3_FinalExam;

import java.util.ArrayList;

public class Barco {
    private String nombre;
    private ArrayList<Carga> cargas = new ArrayList<>();

    public Barco(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCargas(Carga carga){
        this.cargas.add(carga);
    }

    public void mostrarCargas(){
        for (Carga carga: this.cargas) {
            System.out.println(carga.getNombre() + " pesa " + carga.calcularPeso());
        }
    }

}
