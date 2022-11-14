package week_4.repasoParcial;

public abstract class Arma {
    //atributos
    private Integer cantMunMax;
    private Integer alcance;
    private String marca;
    private Double calibre;
    private String estado;

    //constructores

    public Arma(Integer cantMunMax, Integer alcance, String marca, Double calibre, String estado) {
        this.cantMunMax = cantMunMax;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }


    //metodos

    public Boolean puedeSerUtilizada(){
        //aca va la logica
        //implementacion 1
        return (this.estado.equals("EN USO")  && this.calibre >= 9);
        //implementacion 2
        /*
        if (this.estado.equals("EN USO")  && this.calibre >= 9)  {
            return true;
        } else{
            return false;
        }*/

    }

    public Integer getAlcance() {
        return alcance;
    }
}
