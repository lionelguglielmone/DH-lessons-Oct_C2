package week_6.lesson3;

public class Test {
    public static void main(String[] args) {
        try{
            Equipo equipo = new Equipo("Venezuela");
            equipo.cantidadDeJugadores("ARQUERO");

        } catch (ExceptionJugador e) {
            System.out.println(e.getMessage());
        }
    }
}
