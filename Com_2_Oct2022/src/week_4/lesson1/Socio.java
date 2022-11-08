package week_4.lesson1;

public class Socio {
    //atributos
    private Integer numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    //constructor

    public Socio(Integer numeroSocio, String nombre, Double cuotaMensual) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = "cancha de futbol";
    }

    //metodos

    public Double calcularCostoMensual(){
        return this.cuotaMensual;
    }
    public Integer getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(Integer numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
