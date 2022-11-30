package week_7.lesson1.factory;

public class EmpleadoFactory {
    private static EmpleadoFactory empleadoFactory; //= new EmpleadoFactory();

    private EmpleadoFactory(){

    }

    public static EmpleadoFactory getInstance(){
        if(empleadoFactory == null){
            empleadoFactory = new EmpleadoFactory();
        }
        return empleadoFactory;
    }

    public Empleado crearEmpleado(String tipoEmpleado){
        switch (tipoEmpleado){
            case "EMP-RD":
                return new EmpleadoRelacionDependencia(1000.0);
            case "EMP-PH":
                return new EmpleadoContratado(7.0,0.14);
            default:
                return null;
        }
    }
}
