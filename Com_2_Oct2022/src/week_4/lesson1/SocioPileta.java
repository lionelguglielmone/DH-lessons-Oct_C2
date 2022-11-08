package week_4.lesson1;

public class SocioPileta extends Socio{
    //atributos
    private Double costoPileta;
    private Boolean estaHabilitado;

    //constructor
    public SocioPileta(Integer numeroSocio, String nombre, Double cuotaMensual, Double costoPileta, Boolean estaHabilitado){
        super(numeroSocio, nombre, cuotaMensual);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    public String getActividad(){
        return super.getActividad();
    }


    //metodos

    @Override
    public Double calcularCostoMensual(){
        //logica
        Double costoTotalPileta = this.costoPileta + super.getCuotaMensual();
        return costoTotalPileta;
    }
}
