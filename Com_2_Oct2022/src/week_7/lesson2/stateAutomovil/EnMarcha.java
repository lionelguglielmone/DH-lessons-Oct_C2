package week_7.lesson2.stateAutomovil;

public class EnMarcha  implements StateAuto {
    private Automovil automovil;

    public EnMarcha(Automovil automovil) {
        this.automovil = automovil;
    }


    public void acelerar() {
        if (automovil.getCombustibleActual() > 0) {
            System.out.println("Aumenta la velocidad del vehiculo");
            automovil.setVelocidadActual(automovil.getVelocidadActual() + 1);
        } else {
            System.out.println("El automovil se quedo sin combustible");
            automovil.setEstadoActual(new SinCombustible(automovil));
        }
    }
    public void contacto() {
        System.out.println("El automovil no se puede apagar cuando se encuentra en movimiento");
    }
    public void frenar() {
        automovil.setVelocidadActual(automovil.getVelocidadActual() - 1);
        if (automovil.getVelocidadActual() == 0) {
            automovil.setEstadoActual(new Parado(automovil));
        }
    }
}
