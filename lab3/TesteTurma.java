import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteTurma {
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;

    @Before
    public void setUp() {
        disciplina = Creator.criarDisciplina("Matemática");
        professor = Creator.criarProfessor("João", "12345");
        turma = Creator.criarTurma("Turma A", professor, "Segunda-feira 10:00", disciplina);
    }

    @Test
    public void testAdicionarAluno() {
        Aluno aluno1 = Creator.criarAluno("Alice", "98765");
        Aluno aluno2 = Creator.criarAluno("Bob", "54321");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        assertTrue(turma.getAlunos().contains(aluno1));
        assertTrue(turma.getAlunos().contains(aluno2));
    }

    @Test(expected = NullPointerException.class)
    public void testAdicionarAlunoNull() {
        turma.adicionarAluno(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarAlunoExistente() {
        Aluno aluno1 = Creator.criarAluno("Alice", "98765");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno1);
    }
}
