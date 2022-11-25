package week_6.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador j){
        this.jugadores.add(j);
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> deReserva = this.jugadores.subList(18,22);
        return deReserva;
    }

    public ArrayList<Jugador> obtenerReservas2(){
        ArrayList<Jugador> deReserva = new ArrayList<>();
        for(int i=18; i<=this.jugadores.size(); i++){
            deReserva.add(this.jugadores.get(i));
        }
        return deReserva;
    }
    public Integer cantidadDeJugadores(String posicion) throws ExceptionJugador{
        if(!posicion.equals("ARQUERO") || !posicion.equals("DEFENSOR") ||
                !posicion.equals("MEDIOCAMPISTA") || !posicion.equals("DELANTERO")){
            throw new ExceptionJugador("posicion invalida");
        }
        Integer cantJugEnPos = 0;
        for(Jugador jugador: this.jugadores){
            if(posicion.equals(jugador.getPosicion())){
                cantJugEnPos ++;
            }
        }
        return cantJugEnPos;
    }
}
