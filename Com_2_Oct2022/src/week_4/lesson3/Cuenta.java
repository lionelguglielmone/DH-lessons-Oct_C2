package week_4.lesson3;

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


    //caso de sobrecarga
    public void realizarTransferencia(Double monto, String nroCta, String fecha){
        System.out.println("Usted va a transferir " + monto + " a la cuenta " + nroCta + " en la fecha " + fecha);
    }
    public void realizarTransferencia(Double monto, String nroCta){
        System.out.println("Usted esta transfieriendo " + monto + " a la cuenta " + nroCta);
    }




}
