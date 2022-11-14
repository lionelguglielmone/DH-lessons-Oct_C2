package week_4.repasoParcial;

public class ArmaCorta extends Arma{
    //atributos
    private Boolean automatica;

    //constructores

    public ArmaCorta(Integer cantMunMax, Integer alcance, String marca, Double calibre, String estado, Boolean automatica) {
        super(cantMunMax, alcance, marca, calibre, estado);
        this.automatica = automatica;
    }


    //metodos
    //el arma se puede reciclar solo si es automatica
    public Boolean sePuedeReciclar(){
        if(this.automatica){
            return true;
        } else{
            return false;
        }
    }


    public Boolean tieneAlcance200m(){
        //logica
        //implementacion 1
        return getAlcance() >= 200;

        //implementacion 2
        /*if (getAlcance() >= 200){
            return true;
        } else {
            return false;
        }*/
    }
}
