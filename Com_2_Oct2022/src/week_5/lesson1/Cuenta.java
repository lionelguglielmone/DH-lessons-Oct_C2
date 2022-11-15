package week_5.lesson1;

public abstract class Cuenta {

    private double saldo;


    public void depositar(double monto) {
        saldo += monto;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double informarSaldo() {
        return saldo;
    }

    public abstract void extraer(double monto);

    public double getSaldo() {
        return saldo;
    }


}
