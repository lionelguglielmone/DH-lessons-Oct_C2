package week_6.lesson3;

public class Test {
    public static void main(String[] args) {
        try{
            Equipo equipo = new Equipo("Venezuela");
            Equipo equipo2 = new Equipo("Ecuador");
            Equipo equipo3 = new Equipo("Brasil");

            equipo.cantidadDeJugadores("ARQUERO");

        } catch (ExceptionJugador e) {
            System.out.println(e.getMessage());
        }
    }
}
