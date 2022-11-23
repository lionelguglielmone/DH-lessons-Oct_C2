package week_6.lesson2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Double saldoEnCuenta;
    private Double limite;

    public Cliente(String nombre, String apellido, String dni, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
        this.saldoEnCuenta = 0.0;
    }

    public void comprar(Double monto) throws ClienteException {
        Double disponible = this.limite - this.saldoEnCuenta;
        if(monto > disponible){
            throw new ClienteException("Saldo insuficiente");
        } else {
            this.saldoEnCuenta = this.saldoEnCuenta + monto;
        }
    }

    public void saldarDeuda(Double monto) throws ClienteException{
        if(this.saldoEnCuenta == 0){
            throw new ClienteException("No registra deudas a pagar");
        } else {
            this.saldoEnCuenta = this.saldoEnCuenta - monto;
        }
    }

    public Double getSaldoDisponible(){
        return this.limite - this.saldoEnCuenta;
    }
}
