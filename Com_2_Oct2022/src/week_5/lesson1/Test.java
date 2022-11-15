package week_5.lesson1;

public class Test {
    public static void main(String[] args) {

        CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();

        System.out.println(ca.informarSaldo());

        CuentaCorriente cc = new CuentaCorriente();
        cc.setSaldo(3500.0);
        System.out.println("Se gravo impuesto y ahora tiene " + cc.gravar(0.1) + " en su CC");

    }
}
