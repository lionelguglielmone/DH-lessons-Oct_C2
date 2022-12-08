package week_8.lesson2;

public class Curso extends OfertaAcademica {
    private Integer cargaHorariaMensual;
    private Integer cantMeses;
    private Double valorHora;


    public Curso(String nombre, Integer cargaHorariaMensual, Integer cantMeses, Double valorHora) {
        super(nombre);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.cantMeses = cantMeses;
        this.valorHora = valorHora;
    }


    @Override
    public Double calcularPrecio() {
        Double totalValorCurso = this.cargaHorariaMensual*this.cantMeses*this.valorHora;
        return totalValorCurso;
    }
}