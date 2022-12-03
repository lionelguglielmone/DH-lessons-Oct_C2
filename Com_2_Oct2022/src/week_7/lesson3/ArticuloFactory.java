package week_7.lesson3;

public class ArticuloFactory {
    //atributo estatico
    private static ArticuloFactory articuloFactory = new ArticuloFactory();

    //constructor privado
    private ArticuloFactory() {
    }

    //un metodo que entrega la unica instancia de la factory disponible
    public static ArticuloFactory getInstace(){
        return articuloFactory;
    }

    public Articulo crearArticulo(String nombre){
        switch (nombre) {
            case "BATIDORA":
                return new Articulo("batidora");
            case "TOSTADORA":
                return new Articulo("tostadora");
            default:
                return null;
        }
    }

}
