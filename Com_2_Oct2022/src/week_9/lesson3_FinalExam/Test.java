package week_9.lesson3_FinalExam;

public class Test {
    public static void main(String[] args) {
        Barco sanBenito = new Barco("San Benito");
        CargaFactory factory = CargaFactory.getInstance();
        Carga tv = factory.crearCarga("TV 32’ LCD");
        Carga med = factory.crearCarga("caja de medicamentos");
        Carga cont = factory.crearCarga("contenedor");

        sanBenito.agregarCargas(tv);
        sanBenito.agregarCargas(med);
        sanBenito.agregarCargas(cont);

        sanBenito.mostrarCargas();

    }
}
