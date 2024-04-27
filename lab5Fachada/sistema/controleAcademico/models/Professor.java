package lab5Fachada.sistema.controleAcademico.models;
import lab5Fachada.sistema.controleAcademico.auxiliar.Pessoa;

public class Professor extends Pessoa{
    private double tempoDeCasa;

    public Professor(String nome, int id, double tempoDeCasa) {
        super(nome, id);
        this.tempoDeCasa = tempoDeCasa;

    }

    public double getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(double tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    @Override
    public String toString() {
        return "Professor: " + getNome();
    }
}
