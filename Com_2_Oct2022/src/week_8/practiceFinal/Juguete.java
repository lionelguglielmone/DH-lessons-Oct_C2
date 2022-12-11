package week_8.practiceFinal;

public abstract class Juguete {
    private String qr;
    private String detalle;

    public Juguete(String qr, String detalle) {
        this.qr = qr;
        this.detalle = detalle;
    }

    public abstract Double calcularPrecio();

    public String getQr() {
        return qr;
    }

    public String getDetalle() {
        return detalle;
    }
}
