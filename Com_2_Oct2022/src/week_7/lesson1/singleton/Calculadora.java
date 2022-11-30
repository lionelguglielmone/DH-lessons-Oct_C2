package week_7.lesson1.singleton;

public class Calculadora {
    //atributo donde voy a guardar esa unica instancia
    private static Calculadora calculadora = new Calculadora();

    //constructor privado para que nadie pueda instanciarme
    private Calculadora(){

    }

    //creo un metodo que permita compartir el UNICO objeto Calculadora creado
    public static Calculadora getInstance(){
        return calculadora;
    }

    public Integer sumar(Integer num1, Integer num2){
        return num1 + num2;
    }
    public Double cuadrado(Double num1){
        return num1*num1;
    }
}
