package lab2Creator;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private Disciplina disciplina;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;

    public Turma(String nome, Professor professor, String horario, Disciplina disciplina) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
        professor.getHorarios().getListaTurmas().add(this);
        disciplina.addTurmaNaDisciplina(this);
    }

    // tem 2 formas de adicionar o prof na turma no construtor e em profTurma
    public Turma(String nome, String horario, Disciplina disciplina) {
        this.nome = nome;
        this.horario = horario;
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
        disciplina.addTurmaNaDisciplina(this);
    }

    // gets e sets
    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getHorario() {
        return horario;
    }

    // métodos
    public void adicionarAluno(Aluno aluno) throws IllegalArgumentException {
        if (aluno == null) {
            throw new NullPointerException("Aluno não pode ser nulo.");
        }

        if (aluno.getNome() == null || aluno.getMatricula() == null) {
            throw new NullPointerException("Nome e matrícula não podem ser nulos.");
        }

        for (Turma turma : disciplina.getTurmas()) {
            if (turma.getAlunos().contains(aluno)) {
                throw new IllegalArgumentException("Aluno já cadastrado na disciplina.");
            }
        }

        alunos.add(aluno);
        aluno.getAlunoTurma().addTurma(this);
    }
}
