package week_6.lesson1;

public class Test {
    public static void main(String[] args) {
        Jugador messi = new Jugador("Messi", true, false);
        Jugador james = new Jugador("James", true, false);
        Jugador riquelme = new Jugador("Riquelme", false, true);

        Equipo internacional = new Equipo("Internacional");
        internacional.addJugador(messi);
        internacional.addJugador(james);
        internacional.addJugador(riquelme);

        internacional.mostrarJugadoresTitulares();
        System.out.println("La cantidad de jugadores lesionados es " +
                internacional.getCantidadJugadoresLesionados());
    }
}
