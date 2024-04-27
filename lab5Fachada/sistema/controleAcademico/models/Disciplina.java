package lab5Fachada.sistema.controleAcademico.models;

import lab5Fachada.sistema.controleAcademico.auxiliar.Horario;

public class Disciplina {
    private String nome;
    private Horario horario;

    public Disciplina(String nome, String dia, String hora) {
        this.nome = nome;
        this.horario = new Horario(dia, hora);
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Disciplina: " + getNome() + " - " + getHorario().toString();
    }
}
