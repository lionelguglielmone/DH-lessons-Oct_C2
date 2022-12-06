package week_8.lesson1;

public class Test {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        Producto hamburguesa1 = new Producto("Hamburguesa con queso",6.75);
        Producto hamburguesa2 = new Producto("Hamburguesa con cheddar",7.75);

        Producto gaseosa1 = new Producto("Gaseosa de cola", 2.80);
        Producto gaseosa2 = new Producto("Gaseosa de naranja", 2.80);

        Producto papas = new Producto("Papas fritas", 5.25);


        Combo elFurioso = new Combo(0.1);
        elFurioso.agregarProducto(hamburguesa1);
        elFurioso.agregarProducto(gaseosa1);
        elFurioso.agregarProducto(papas);

        Combo elManso = new Combo(0.25);
        elManso.agregarProducto(hamburguesa2);
        elManso.agregarProducto(gaseosa2);
        elManso.agregarProducto(papas);

        miCarrito.agregarComanda(elFurioso);
        miCarrito.agregarComanda(papas);
        miCarrito.agregarComanda(gaseosa1);
        miCarrito.agregarComanda(elManso);

        System.out.println("El total de su compra es: " + miCarrito.obtenerTotal());



    }
}
