package week_7.lesson2.stateAutomovil;

public class Automovil {
    private StateAuto estadoActual;
    private Integer velocidadActual;
    private Integer combustibleActual;


    public Automovil(Integer combustibleActual) {
        this.estadoActual = new Apagado(this);
        this.combustibleActual = combustibleActual;
        this.velocidadActual = 0;
    }


    public StateAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(StateAuto estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Integer getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Integer velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Integer getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(Integer combustibleActual) {
        this.combustibleActual = combustibleActual;
    }

    public void acelerar(){
        estadoActual.acelerar();
    }

    public void contacto(){
        estadoActual.contacto();
    }

    public void frenar(){
        estadoActual.frenar();
    }

}
