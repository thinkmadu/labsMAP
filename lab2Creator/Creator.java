package lab2Creator;

public class Creator {
    public static Disciplina criarDisciplina(String nome) {
        return new Disciplina(nome);
    }

    public static Professor criarProfessor(String nome, String codigo) {
        return new Professor(nome, codigo);
    }

    public static Turma criarTurma(String nome, Professor professor, String horario, Disciplina disciplina) {
        return new Turma(nome, professor, horario, disciplina);
    }

    public static Aluno criarAluno(String nome, String matricula) {
        return new Aluno(nome, matricula);
    }

    public static AlunoTurma criarAlunoTurma(Aluno aluno) {
        return new AlunoTurma(aluno);
    }

    public static ProfTurma criarProfTurma(Professor professor) {
        return new ProfTurma(professor);
    }
}
