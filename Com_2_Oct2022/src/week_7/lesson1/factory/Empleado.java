package week_7.lesson1.factory;

import java.util.ArrayList;

public abstract class Empleado {
    private String nombreApellido;
    private Integer legajo;



    public abstract Double calcular(Integer dias);

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}
