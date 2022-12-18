package week_9.lesson3_FinalExam;

public class CargaSimple extends Carga {
    private Double peso;
    private Boolean refrigeracion;

    public CargaSimple(String nombre, Double peso, Boolean refrigeracion) {
        super(nombre);
        this.peso = peso;
        this.refrigeracion = refrigeracion;
    }


    @Override
    public Double calcularPeso() {
        if (this.refrigeracion == true) {
            return this.peso + 2;
        } else {
            return this.peso;
        }
    }
}
