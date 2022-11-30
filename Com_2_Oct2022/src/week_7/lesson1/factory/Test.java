package week_7.lesson1.factory;

public class Test {
    public static void main(String[] args) {
        EmpleadoFactory ef = EmpleadoFactory.getInstance();
        Empleado empleado1 = ef.crearEmpleado("EMP-RD");
        empleado1.setNombreApellido("Juana");
        empleado1.getNombreApellido();
    }
}
