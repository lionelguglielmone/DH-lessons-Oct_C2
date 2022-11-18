package week_5.lesson2;

public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcion;


    public Final(Double nota, Double notaOral) {
        super(nota);
        this.notaOral = notaOral;
    }

    @Override
    public int compareTo(Object obj) {
        Final fin = (Final) obj;
        int respuesta = 0;


        if ((this.notaOral + getNota())/2 > ((fin.getNota() + fin.getNotaOral())/2)) {
            respuesta = 1;
        }
        if ((this.notaOral + getNota())/2 < ((fin.getNota() + fin.getNotaOral())/2) ){
            respuesta = -1;
        }
        return respuesta;

    }


    public Double getNotaOral(){
        return this.notaOral;
    }


    @Override
    public Boolean estaAprobado(){
        return getNota()>=4 && this.notaOral >=4;
    }
}
