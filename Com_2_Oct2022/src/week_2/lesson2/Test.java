package week_2.lesson2;

public class Test {
    public static void main(String[] args) {
        Cliente juan = new Cliente(1000, "Juan");
        Cliente maria = new Cliente(1001,"Maria");
        //al dia siguiente, viene Juan y compra una bondiola y gasta 1000.
        //No tiene dinero asi que se lo cargamos como deuda
        juan.setDeuda(1000.0);

        //Al final de la jornada, el dueño de la tienda quiere ver cuanto
        //adeuda Juan

        System.out.println("Juan adeuda: " + juan.getDeuda());

        //Al dia siguiente, Juan no puede pagar la deuda pero quiere comprar
        //otra bondiola

        juan.incrementarDeuda(1000.0);
        System.out.println("Juan adeuda: " + juan.getDeuda());

        

    }
}
