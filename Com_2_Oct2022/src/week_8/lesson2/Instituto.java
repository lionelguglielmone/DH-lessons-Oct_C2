package week_8.lesson2;

import java.util.ArrayList;

public class Instituto {
    //atributos
    private ArrayList<OfertaAcademica> ofertasAcademicas;
    private String nombre;
    //constructor
    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertasAcademicas = new ArrayList<>();
    }

    //metodos

    public void agregarOfertaAcademica(OfertaAcademica oa) {
        this.ofertasAcademicas.add(oa);
    }

    public void generarInforme() {
        for (OfertaAcademica ofertaAcademica: this.ofertasAcademicas) {
            System.out.println("Nombre: " + ofertaAcademica.getNombre());
            System.out.println("Precio: " + ofertaAcademica.calcularPrecio());
        }
    }



}
