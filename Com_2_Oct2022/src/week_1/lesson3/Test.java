package week_1.lesson3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa que decide si el numero ingresado es " +
                "primo");

        Integer numero = scanner.nextInt();

        Calculadora calculadora = new Calculadora();
        Boolean esPrimo = calculadora.esPrimo(numero);
        Boolean esPar = calculadora.esPar(numero);
        if(esPrimo){
            System.out.println("El numero: " + numero + " es primo");
        } else {
            System.out.println("El numero: " + numero + " NO es primo");
        }


    }
}
