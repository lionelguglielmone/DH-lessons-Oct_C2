package week_6.lesson1;

public class Jugador implements Comparable<Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(String nombre, Boolean esTitular, Boolean estaLesionado) {
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.estaLesionado = estaLesionado;
    }

    @Override
    public int compareTo(Jugador otroJugador){

        int resultado = 0;
        if(this.nroCamiseta > otroJugador.getNroCamiseta()) {
            resultado = 1;
        }
        if(this.nroCamiseta < otroJugador.getNroCamiseta()) {
            resultado = -1;
        }
        return resultado;

    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public void setEstaLesionado(Boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(Boolean esTitular) {
        this.esTitular = esTitular;
    }
}
