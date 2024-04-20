package lab2Creator;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinasMatriculado;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinasMatriculado() {
        return disciplinasMatriculado;
    }

    public void setDisciplinasMatriculado(List<Disciplina> disciplinasMatriculado) {
        this.disciplinasMatriculado = disciplinasMatriculado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasMatriculado = new ArrayList<>();
    }

    public void matricularDisciplina(Disciplina disciplina) {
        this.disciplinasMatriculado.add(disciplina);
    }

    public ArrayList<String> getHorario() {
        ArrayList<String> horarios = new ArrayList<>();
        for (Disciplina disciplina : disciplinasMatriculado) {
            horarios.add(disciplina.getHorario());
        }
        return horarios;
    }

    public void setHorario(String codigoDisciplina, String novoHorario) {
        for (Disciplina disciplina : disciplinasMatriculado) {
            if (disciplina.getCodigo().equals(codigoDisciplina)) {
                disciplina.setHorario(novoHorario);
                return;
            }
        }
        System.out.println("Disciplina não encontrada.");
    }
}
