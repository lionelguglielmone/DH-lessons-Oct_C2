package week_7.lesson2.stateAutomovil;

public class SinCombustible implements StateAuto {
    private Automovil automovil;

    public SinCombustible(Automovil automovil){
        this.automovil = automovil;
    }



    public void acelerar() {
        System.out.println("El automovil no tiene combustible");
    }
    public void contacto() {
        System.out.println("El automovil se quedo sin combustible. No se puede encender");

    }
    public void frenar() {
        System.out.println("El automovil se quedo sin combustible. No se frenar");

    }
}
