package week_7.lesson1.factory;

public class EmpleadoRelacionDependencia extends Empleado{
    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcular(Integer dias) {
        // si recibo 30 pago el total
        // 30 ______ sueldoMensual
        //  dias _____ dias*sueldoMensual/30

        return dias*sueldoMensual/30;
    }

    public Double getSueldoMensual(){
        return this.sueldoMensual;
    }
}
