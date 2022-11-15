package week_5.lesson1;

public class CuentaCorriente extends Cuenta implements ImpuestoGravable {

    private double descubiertoPermitido;



    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }



    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }



    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido <= monto)
            setSaldo(informarSaldo() - monto);


    }
    //porcentaje es entre 0 y 1
    public Double gravar(Double porcentaje){
        setSaldo(getSaldo()*(1-porcentaje));
        return getSaldo();

        /*
        Double aDescontar = getSaldo()*porcentaje;
        setSaldo(getSaldo() - aDescontar);
        return getSaldo();*/
    }

}
