package lab2Creator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import lab2Creator.*;

public class ProfTurmaTest {
    private ProfTurma profTurma;
    private Professor professor;
    private Turma turma1;
    private Turma turma2;

    @Before
    public void setUp() {
        // Criando professor usando o padrão Creator
        professor = Creator.criarProfessor("João", "12345");
        profTurma = Creator.criarProfTurma(professor);

        // Criando turmas usando o padrão Creator
        turma1 = Creator.criarTurma("Turma A", professor, "Segunda-feira 10:00", Creator.criarDisciplina("Matemática"));
        turma2 = Creator.criarTurma("Turma B", professor, "Quarta-feira 14:00", Creator.criarDisciplina("Física"));
    }

    @Test
    public void testAdicionarTurma() {
        profTurma.adicionarTurma(turma1);

        assertTrue(profTurma.getListaTurmas().contains(turma1));
        assertEquals(professor, turma1.getProfessor());
    }

    @Test(expected = NullPointerException.class)
    public void testAdicionarTurmaNull() {
        profTurma.adicionarTurma(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarTurmaComProfessorDiferente() {
        // Cria um novo professor diferente
        Professor outroProfessor = Creator.criarProfessor("Maria", "54321");
        // Cria uma nova turma com o professor diferente
        Turma turmaComOutroProfessor = Creator.criarTurma("Turma B", outroProfessor, "Quarta-feira 14:00",
                Creator.criarDisciplina("Física"));

        profTurma.adicionarTurma(turmaComOutroProfessor);
    }

    @Test
    public void testTurmasMinistradas() {
        profTurma.adicionarTurma(turma1);
        profTurma.adicionarTurma(turma2);

        String resultadoEsperado = "Turmas ministradas pelo professor João:\n" +
                "\nTurma: Turma A\nDisciplina: Matemática\nHorário: Segunda-feira 10:00\n" +
                "\nTurma: Turma B\nDisciplina: Física\nHorário: Quarta-feira 14:00\n";

        assertEquals(resultadoEsperado, profTurma.turmasMinistradas());
    }
}
