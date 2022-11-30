package week_7.lesson2.stateAutomovil;

public class Parado  implements StateAuto {
    private Automovil automovil;

    public Parado(Automovil automovil) {
        this.automovil = automovil;
    }


    public void acelerar() {
        if (automovil.getCombustibleActual() > 0) {
            System.out.println("Ahora el vehiculo se encuentra andando");
            automovil.setVelocidadActual(automovil.getVelocidadActual() + 1);
            automovil.setEstadoActual(new EnMarcha(automovil));
        } else {
            System.out.println("El automovil no tiene combustible");
            automovil.setEstadoActual(new SinCombustible(automovil));
        }
    }
    public void contacto() {
        System.out.println("El automovil ahora esta apagado");
        automovil.setEstadoActual(new Apagado(automovil));
    }
    public void frenar() {
        System.out.println("El automovil se encuentra parado");

    }
}
