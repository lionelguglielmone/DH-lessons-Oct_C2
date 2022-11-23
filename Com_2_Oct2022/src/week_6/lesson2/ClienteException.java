package week_6.lesson2;

public class ClienteException extends Exception{
    public ClienteException(){
        super();
    }

    public ClienteException(String mensaje){
        super(mensaje);
    }
}
