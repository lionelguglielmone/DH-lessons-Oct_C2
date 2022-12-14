package week_9.lesson1;

public interface Observable {

    void agregar(Observer observer);
    void remover(Observer observer);
    void notificar(String mensaje);


}
