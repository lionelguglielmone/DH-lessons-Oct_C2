package week_1.lesson3;

public class Calculadora {



    public Boolean esPrimo(Integer numero) {
        //logica de numero primo
        Boolean esPrimo = true;

        for(int i=2; i < numero; i++ ){
            if(numero%i == 0) { //encontre otro numero que divide a numero
                System.out.println("divisor: " + i);
                esPrimo = false;
            };
        }

        return esPrimo;
    }

    public Boolean esPar(Integer numero){
        //logica
        return false;
    }

}
