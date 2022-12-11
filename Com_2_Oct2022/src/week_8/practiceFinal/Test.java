package week_8.practiceFinal;

public class Test {
    public static void main(String[] args) {

        Jugueteria miSol = new Jugueteria("Mi Sol");
        JugueteFactory jugueteFactory = JugueteFactory.getInstance();
        Juguete sp = jugueteFactory.crearJuguete("Spiderman");
        Juguete doctorStrange = jugueteFactory.crearJuguete("Doctor Strange");
        Juguete avengersAssemble = jugueteFactory.crearJuguete("Avengers assemble");
        Juguete mundoMarvel = jugueteFactory.crearJuguete("Mundo Marvel");

        miSol.agregarJugueteACatalogo(sp);
        miSol.agregarJugueteACatalogo(doctorStrange);
        miSol.agregarJugueteACatalogo(avengersAssemble);
        miSol.agregarJugueteACatalogo(mundoMarvel);

        System.out.println("Estos son los productos del catalogo Diciembre 2022");
        miSol.mostrarCatalogo();
        System.out.println("Gracias por su compra");


    }
}
