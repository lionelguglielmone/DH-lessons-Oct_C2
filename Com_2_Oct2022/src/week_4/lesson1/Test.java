package week_4.lesson1;

public class Test {
    public static void main(String[] args) {

        SocioPileta jose = new SocioPileta(1234,"Jose",
                8000.0, 1000.0, true);
        System.out.println("Actividad de Jose:" + jose.getActividad());

        System.out.println("Abono total de Jose:" + jose.calcularCostoMensual());




        SocioPileta mariana = new SocioPileta(1235,"Mariana",
                8000.0, 1000.0, false);
        System.out.println("Actividad de Mariana:" + mariana.getActividad());


        Socio lionel = new Socio(4444,"Lionel", 8000.0);
        System.out.println("Abono total de Lionel:" + lionel.calcularCostoMensual());

    }
}
