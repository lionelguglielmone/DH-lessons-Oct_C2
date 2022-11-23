package week_6.lesson2;

public class Test {
    public static void main(String[] args) {
        try{
            Cliente juanEduardo = new Cliente("Juan", "Eduardo","1234",
                    1000.0);
            Cliente mariaAna = new Cliente("Ana", "Maria", "4321",
                    2000.0);

            //juanEduardo.saldarDeuda(100.0);


            //Viene juan y compra una lampara de 500
            juanEduardo.comprar(500.0);
            System.out.println("A Juan le queda un disponible de: " + juanEduardo.getSaldoDisponible());

            //Viene Ana a mi tienda y compra una caja de herramientas por 1350
            mariaAna.comprar(1350.0);
            System.out.println("A Maria le queda un disponible de: " + mariaAna.getSaldoDisponible());

            //Maria quiere comprar una mesa de 1000
            //mariaAna.comprar(1000.0);





        } catch(ClienteException exception) {
            System.out.println("El error fue causado por: " + exception.getMessage());
        }


    }
}
