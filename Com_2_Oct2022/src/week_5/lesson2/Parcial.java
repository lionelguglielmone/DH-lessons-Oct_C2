package week_5.lesson2;

public class Parcial extends Examen{
    private Integer unidad;
    private Integer numeroReintentos;


    public Parcial(Double nota, Integer unidad) {
        super(nota);
        this.unidad = unidad;
    }

    @Override
    public Boolean estaAprobado(){
        return getNota()>=4;
    }


}
