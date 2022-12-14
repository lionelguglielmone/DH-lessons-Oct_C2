package week_9.lesson1;

import java.util.ArrayList;

public class Artista implements Observable{
    private String nombreApellido;
    private ArrayList<Observer> seguidores;

    public Artista(String nombreApellido) {
        this.nombreApellido = nombreApellido;
        this.seguidores = new ArrayList<>();
    }

    @Override
    public void agregar(Observer observer) {
        this.seguidores.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        this.seguidores.remove(observer);
    }

    @Override
    public void notificar(String mensaje) {
        for (Observer observer: this.seguidores) {
            observer.update(mensaje);
        }
    }

    public void subirFoto(){
        System.out.println("Foto subida");
        //System.out.println("El artista " + this.nombreApellido + " ha subido una foto");
        notificar("El artista " + this.nombreApellido + " ha subido una foto");
    }

    public void publicarFechaDeConcierto(String fecha) {
        System.out.println("Nueva fecha publicada");
        notificar("El artista " + this.nombreApellido + " ha agregado una nueva funcion" +
                "con fecha " + fecha);

    }
}
