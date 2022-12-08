package week_8.lesson2;

import java.util.ArrayList;

public class Programa extends OfertaAcademica {
    private ArrayList<Curso> cursos;
    private Double bonificacion;

    public Programa(String nombre, Double bonificacion) {
        super(nombre);
        this.bonificacion = bonificacion;
        this.cursos = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double totalSinBonificacion = 0.0;
        for (Curso curso: this.cursos) {
            totalSinBonificacion += curso.calcularPrecio();
        }
        Double totalConBonificacion = totalSinBonificacion*(1-bonificacion);
        return totalConBonificacion;
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }


}
