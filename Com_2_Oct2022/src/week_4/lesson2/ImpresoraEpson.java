package week_4.lesson2;

public class ImpresoraEpson extends Impresora{
    //atributos



    //constructor
    public ImpresoraEpson(String modelo, String tipoConexion, Integer hojasDisponibles){
        super(modelo, tipoConexion, hojasDisponibles);

    }

    //metodos
    @Override
    public String imprimir(){
        return "Estoy imprimiendo como impresora Epson";
    }

    @Override
    public void prender(){
        System.out.println("Estoy prendiendo como una impresora Epson");
    }


}
