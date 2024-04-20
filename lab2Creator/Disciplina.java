package lab2Creator;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String horario;
    private String codigo;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setDisciplinasMatriculado(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina(String horario, String nome, String codigo, Professor professor) {
        this.horario = horario;
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }

    public int getNumeroDeAlunos() {
        return alunos.size();
    }
}
