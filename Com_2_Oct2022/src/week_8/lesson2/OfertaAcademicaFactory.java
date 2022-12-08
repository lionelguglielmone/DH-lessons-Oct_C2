package week_8.lesson2;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory ofertaAcademicaFactory = new OfertaAcademicaFactory();

    //constructor privado
    private OfertaAcademicaFactory(){
    }

    //creamos un metodo para que quien necesite
    //esta factory pueda utilizarla
    public static OfertaAcademicaFactory getInstance(){
        return ofertaAcademicaFactory;
    }

    //creamos el metodo para fabricar los productos que ofrece el Instituto
    public OfertaAcademica crearOfertaAcademica(String nombre) {
        switch (nombre) {
            case "frontend":
                return new Curso("frontend",16,2,1000.0);
            case "backend":
                return new Curso("backend",20,2,900.0);
            case "fullstack":
                Curso frontend =  new Curso("frontend",16,2,1000.0);
                Curso backend =  new Curso("backend",20,2,900.0);
                Programa fullstack = new Programa("fullstack",0.2);
                fullstack.agregarCurso(frontend);
                fullstack.agregarCurso(backend);
                return fullstack;
            default:
                return null;


        }
    }
}