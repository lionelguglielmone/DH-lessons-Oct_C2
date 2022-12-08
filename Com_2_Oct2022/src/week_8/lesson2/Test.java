package week_8.lesson2;

public class Test {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("Instituto Pellegrini");

        //llamamos a la fabrica
        OfertaAcademicaFactory factory = OfertaAcademicaFactory.getInstance();
        OfertaAcademica backend = factory.crearOfertaAcademica("backend");
        OfertaAcademica frontend = factory.crearOfertaAcademica("frontend");
        OfertaAcademica fullstack = factory.crearOfertaAcademica("fullstack");
        instituto.agregarOfertaAcademica(backend);
        instituto.agregarOfertaAcademica(frontend);
        instituto.agregarOfertaAcademica(fullstack);

        instituto.generarInforme();


    }
}
