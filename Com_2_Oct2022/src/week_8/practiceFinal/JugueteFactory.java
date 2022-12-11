package week_8.practiceFinal;

public class JugueteFactory {
    private static JugueteFactory jugueteFactory = new JugueteFactory();

    private JugueteFactory(){
    }
    public static JugueteFactory getInstance() {
        return jugueteFactory;
    }

    public Juguete crearJuguete(String juguete) {
        switch (juguete) {
            case "Spiderman":
                return new Individual("123AAA4FGH","spiderman action figure",
                        true,4000.0,0.5);
            case "Doctor Strange":
                return new Individual("123AAA4FFF", "doctor strange action figure",
                        true, 3000.0,0.5);
            case "Avengers assemble":
                return new Individual("985AAA4MNK","juego de mesa avengers", false,
                        8000.0,0.5);
            case "Mundo Marvel":
                Individual spiderman = new Individual("123AAA4FGH","spiderman action figure",
                        true,4000.0,0.5);
                Individual doctorStrange = new Individual("123AAA4FFF", "doctor strange action figure",
                        true, 3000.0,0.5);
                Individual avengersAssemble = new Individual("985AAA4MNK","juego de mesa avengers", false,
                        8000.0,0.5);
                Combo mundoMarvel = new Combo("999ZZZ4FAA", "productos marvel para niños y niñas",0.25);
                mundoMarvel.agregarJuguete(spiderman);
                mundoMarvel.agregarJuguete(doctorStrange);
                mundoMarvel.agregarJuguete(avengersAssemble);
                return mundoMarvel;
            default:
                return null;
        }
    }

}
