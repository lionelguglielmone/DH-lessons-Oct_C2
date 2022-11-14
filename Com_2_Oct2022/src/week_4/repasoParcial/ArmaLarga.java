package week_4.repasoParcial;

public class ArmaLarga extends Arma{
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
}
