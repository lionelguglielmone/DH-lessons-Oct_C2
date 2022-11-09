package week_4.lesson2;

public abstract class Impresora {
    //atributos
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private Integer hojasDisponibles;
    private Double porcentajeTinta;

    //constructor

    public Impresora(String modelo, String tipoConexion, Integer hojasDisponibles) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = 100.0;
    }




    //metodos
    public Boolean tienePapel(){

        return hojasDisponibles > 0;


        //forma mas sucia pero por ahi mas clara
        /*
        if(this.hojasDisponibles > 0) {
            return true;
        } else {
            return false;
        }*/

    }

    public abstract String imprimir();

    public abstract void prender();

}
