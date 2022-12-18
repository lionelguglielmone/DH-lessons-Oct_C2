package week_9.lesson3_FinalExam;

public class CargaFactory {
    //ESTA PRIMERA PARTE OBEDEC AL SINGLETON
    //atributo donde se guarda la unica instancia del factory
    private static CargaFactory factory = new CargaFactory();
    //hacemos el constructor privado
    private CargaFactory(){

    }
    public static CargaFactory getInstance(){
        return factory;
    }
    //AHORA, DEFINIMOS EL METODO PROPIO DE LA FACTORY

    public Carga crearCarga(String nombreDeLaCarga) {
        switch (nombreDeLaCarga) {
            case "TV 32’ LCD":
                return new CargaSimple("TV 32’ LCD", 3.0,false);
            case "caja de medicamentos":
                return new CargaSimple("caja de medicamentos",2.0,true);
            case "contenedor":
                CargaSimple tv = new CargaSimple("TV 32’ LCD", 3.0,false);
                CargaSimple med = new CargaSimple("caja de medicamentos",2.0,true);
                CargaContenedor contenedor = new CargaContenedor("contenedor",100.0);
                contenedor.agregarCargaSimple(tv);
                contenedor.agregarCargaSimple(med);
                return contenedor;
            default:
                return null;
        }

    }


}
