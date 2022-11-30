package week_7.lesson1.factory;

public class EmpleadoContratado extends Empleado{
    private Double importePorHora;
    private Double retencionImpuesto; //va de 0 a 1
    //1 ______________100%
    // 0.14 __________ 14%

    public EmpleadoContratado(Double importePorHora, Double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcular(Integer dias) {
        // 1 dia ______ 8hs
        // dias ________ dias*hora*importePorHora

        return dias*8*importePorHora*(1-retencionImpuesto);
    }
}
