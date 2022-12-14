package week_9.lesson1;

public class Seguidor implements Observer{

    private String nombreApellido;

    public Seguidor(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    @Override
    public void update(String mensaje) {
        System.out.println(this.nombreApellido + " ha recibido el siguiente mensaje: " + mensaje );
    }
}
