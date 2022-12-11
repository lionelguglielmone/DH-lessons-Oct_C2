package week_8.practiceFinal;

public class Individual extends Juguete{
    private Boolean importado;
    private Double precioBase;
    private Double recargoPorImportacion; //0.3


    public Individual(String qr, String detalle, Boolean importado, Double precioBase, Double recargoPorImportacion) {
        super(qr, detalle);
        this.importado = importado;
        this.precioBase = precioBase;
        this.recargoPorImportacion = recargoPorImportacion;
    }


    @Override
    public Double calcularPrecio() {
        if(this.importado) {
            return this.precioBase*(1 + this.recargoPorImportacion);
        } else {
            return this.precioBase;
        }
    }
}
