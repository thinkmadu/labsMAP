import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteAlunoTurma {
    private AlunoTurma alunoTurma;
    private Turma turma1;
    private Turma turma2;
    private Professor professor1;
    private Professor professor2;
    private Disciplina portugues;
    private Disciplina filosofia;

    @Before
    public void setUp() {
        // Criando aluno usando o padrão Creator
        Aluno aluno = Creator.criarAluno("Alice", "12345");
        alunoTurma = Creator.criarAlunoTurma(aluno);
        professor1 = Creator.criarProfessor("Ângela", "1234");
        professor2 = Creator.criarProfessor("Paulo", "1234");
        portugues = Creator.criarDisciplina("Português");
        filosofia = Creator.criarDisciplina("Filosofia"); // Corrigindo o nome da disciplina

        // Criando turmas usando o padrão Creator
        turma1 = Creator.criarTurma("Turma A", professor1, "Segunda-feira 10:00", portugues);
        turma2 = Creator.criarTurma("Turma B", professor2, "Quarta-feira 14:00", filosofia);
    }

    @Test(expected = NullPointerException.class)
    public void testAddTurmaNull() {
        alunoTurma.addTurma(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTurmaDuplicada() {
        alunoTurma.addTurma(turma1);
        // Adicionando a mesma turma novamente deve lançar uma exceção
        alunoTurma.addTurma(turma1);
    }

    @Test
    public void testAulas() {
        alunoTurma.addTurma(turma1);
        alunoTurma.addTurma(turma2);

        String resultadoEsperado = "Turmas do aluno Alice:\n" +
                                   "\nTurma: Turma A\nDisciplina: Português\nHorário: Segunda-feira 10:00\n" +
                                   "\nTurma: Turma B\nDisciplina: Filosofia\nHorário: Quarta-feira 14:00\n\n";

        assertEquals(resultadoEsperado, alunoTurma.aulas());
    }
}
