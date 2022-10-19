package week_1.lesson2;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Por favor, ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Las iniciales de su nombre y apellido son: " + nombre.charAt(0)
                + "." + apellido.charAt(0) + "." );



    }
}
