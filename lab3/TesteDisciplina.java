import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteDisciplina {

    private Disciplina disciplina;
    private Turma turma1, turma2;
    private Professor professor1, professor2;

    @Before
    public void setUp() {
        // Criando disciplina usando o padrão Creator
        disciplina = Creator.criarDisciplina("Matemática");

        // Criando professores usando o padrão Creator
        professor1 = Creator.criarProfessor("João", "12334");
        professor2 = Creator.criarProfessor("Maria", "54327");

        // Criando turmas usando o padrão Creator
        turma1 = Creator.criarTurma("Manhã", professor1, "8h às 10h", disciplina);
        turma2 = Creator.criarTurma("Tarde", professor2, "13h às 15h", disciplina);

        // Adicionando alunos às turmas
        turma1.adicionarAluno(new Aluno("Ana", "1234"));
        turma1.adicionarAluno(new Aluno("Bruno", "5678"));
        turma2.adicionarAluno(new Aluno("Carlos", "9012"));
    }

    @Test
    public void testaGetHorarioTurma1() {
        String horarioEsperado = "8h às 10h";
        String horarioAtual = turma1.getHorario();

        assertEquals(horarioEsperado, horarioAtual);
    }

    @Test
    public void testaGetProfessorTurma2() {
        String professorEsperado = "Maria";
        String professorAtual = turma2.getProfessor().getNome();

        assertEquals(professorEsperado, professorAtual);
    }

    @Test
    public void testaGetDisciplinaTurma1() {
        String disciplinaEsperada = "Matemática";
        String disciplinaAtual = turma1.getDisciplina().getNome();

        assertEquals(disciplinaEsperada, disciplinaAtual);
    }

    @Test
    public void testaGetDisciplinaTurma2() {
        String disciplinaEsperada = "Matemática";
        String disciplinaAtual = turma2.getDisciplina().getNome();

        assertEquals(disciplinaEsperada, disciplinaAtual);
    }

    @Test
    public void testaGetNome() {
        String nomeEsperado = "Matemática";
        String nomeAtual = disciplina.getNome();

        assertEquals(nomeEsperado, nomeAtual);
    }

    @Test
    public void testaAddTurmaNaDisciplina() {
        disciplina.addTurmaNaDisciplina(turma1);
        disciplina.addTurmaNaDisciplina(turma2);

        assertEquals(2, disciplina.getTurmas().size());
        assertTrue(disciplina.getTurmas().contains(turma1));
        assertTrue(disciplina.getTurmas().contains(turma2));
    }

    @Test
    public void testaQtdAlunos() {
        disciplina.addTurmaNaDisciplina(turma1);
        disciplina.addTurmaNaDisciplina(turma2);

        String totalAlunosEsperado = "\nQuantidade de alunos na disciplina Matemática: 3";
        String totalAlunosAtual = disciplina.qtdAlunos();

        assertEquals(totalAlunosEsperado, totalAlunosAtual);
    }
}
