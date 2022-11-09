package week_4.lesson2;

public class ImpresoraCanon extends Impresora{
    //atributos



    //constructor
    public ImpresoraCanon(String modelo, String tipoConexion, Integer hojasDisponibles) {
        super(modelo, tipoConexion, hojasDisponibles);
    }


    //metodos

    @Override
    public String imprimir(){
        return "Estoy imprimiendo como impresora Canon";
    }

    @Override
    public void prender(){
        System.out.println("Estoy prendiendo como una impresora Canon");
    }

}
