package week_6.lesson1;


import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        for(Jugador jugador: this.jugadores){
            if(jugador.getEsTitular() == true){
                System.out.println(jugador.getNombre());
            }
        }
    }

    public Integer getCantidadJugadoresLesionados(){
        Integer cantidadJugLes = 0;
        for(Jugador jugador: this.jugadores){
            if(jugador.getEstaLesionado()){
                cantidadJugLes ++;
            }
        }
        return cantidadJugLes;
    }



}
