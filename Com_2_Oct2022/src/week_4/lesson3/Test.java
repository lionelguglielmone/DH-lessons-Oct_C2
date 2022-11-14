package week_4.lesson3;

public class Test {

    public static void main(String[] args) {

        CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();

        System.out.println(ca.informarSaldo());

        CuentaCorriente cc = new CuentaCorriente();
        cc.setDescubiertoPermitido(1000);
        cc.setSaldo(100);
        cc.extraer(100);
        System.out.println(cc.informarSaldo());
        cc.extraer(100);
        System.out.println(cc.informarSaldo());

        ca.realizarTransferencia(500.0, "1234");
        ca.realizarTransferencia(500.0, "1234","20-20-2022");

    }
}
