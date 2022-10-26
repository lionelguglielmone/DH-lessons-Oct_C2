package week_2.lesson2;

public class Cliente {
    //atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //constructores
    public Cliente (Integer numero, String nombre){
        this.numeroCliente = numero;
        this.nombre = nombre;
        this.deuda = 0.0;
    }



    //metodos
    public void incrementarDeuda(Double monto){
        this.deuda += monto;
    }


    public Integer getNumeroCliente(){
        return this.numeroCliente;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Double getDeuda(){
        return this.deuda;
    }

    public void setNumeroCliente(Integer numeroCliente){
        this.numeroCliente = numeroCliente;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setDeuda(Double deuda){
        this.deuda = deuda;
    }


}
