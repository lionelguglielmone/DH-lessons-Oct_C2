package week_4.repasoParcial;

public class ArmaLarga extends Arma implements Comparable{
    //atributos
    private Boolean tieneSelloRENAR;
    private String descripcion;
    private Integer nivel;

    public ArmaLarga(Integer cantMunMax, Integer alcance, String marca, Double calibre, String estado, Boolean tieneSelloRENAR, Integer nivel) {
        super(cantMunMax, alcance, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.nivel = nivel;
    }

//constructores


    //metodos


    @Override
    public int compareTo(Object o) {
        ArmaLarga armaLarga = (ArmaLarga) o;
        int resultado = 0;
        if(this.nivel > armaLarga.getNivel()) {
            resultado = 1;
        }
        if(this.nivel < armaLarga.getNivel()) {
            resultado = -1;
        }
        return resultado;    }

    public Integer getNivel(){
        return this.nivel;
    }
}
