package week_7.lesson3;

public class Test {
    public static void main(String[] args) {
        ArticuloFactory factory = ArticuloFactory.getInstace();
        Articulo batidora1 = factory.crearArticulo("BATIDORA");
        Articulo batidora2 = factory.crearArticulo("BATIDORA");
        Articulo batidora3 = factory.crearArticulo("BATIDORA");


    }
}
