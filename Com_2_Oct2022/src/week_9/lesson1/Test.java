package week_9.lesson1;

public class Test {
    public static void main(String[] args) {
        Artista lali = new Artista("Lali Esposito");
        Seguidor juana = new Seguidor("Juana");
        Seguidor roberto = new Seguidor("Roberto");
        Seguidor sammy = new Seguidor("Sammy");

        lali.subirFoto();


        lali.agregar(juana);
        lali.subirFoto();

        lali.agregar(roberto);
        lali.agregar(sammy);
        lali.subirFoto();

        lali.publicarFechaDeConcierto("20 de Enero de 2023");
    }
}
