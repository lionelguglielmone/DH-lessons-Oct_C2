package week_7.lesson2.stateAutomovil;

public class Apagado implements StateAuto {
    private Automovil automovil;

    public Apagado(Automovil automovil) {
        this.automovil = automovil;
    }


    public void acelerar() {
        System.out.println("El automovil se encuentra apagado");
    }
    public void contacto() {
        if (automovil.getCombustibleActual() > 0) {
            System.out.println("El automovil se encuentra encendido y parado");
            automovil.setEstadoActual(new Parado(automovil));
        } else {
            System.out.println("El automovil no tiene combustible");
        }

    }
    public void frenar() {
        System.out.println("El automovil se encuentra apagado");

    }
}
