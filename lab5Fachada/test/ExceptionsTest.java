package lab5Fachada.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.Before;
import lab5Fachada.SIG;
import lab5Fachada.sistema.administração.Agenda;
import lab5Fachada.sistema.controleAcademico.exception.AlunoException;
import lab5Fachada.sistema.controleAcademico.exception.ProfessorException;
import lab5Fachada.sistema.controleAcademico.exception.TurmaException;

public class ExceptionsTest {
    private static SIG sig;
    private static Agenda agenda;

    @Before
    public void startUp() {
        sig = new SIG();
        agenda = new Agenda();
    }

    //Testes de exceção:
    @Test
    public void testProfessorException(){ //para professor não cadastrado
        assertThrows(ProfessorException.class, () -> {
            sig.getControleAcademico().getProfessor("Professor não existe");
        });
    }

    @Test
    public void testAlunoException(){  //para aluno não cadastrado
        assertThrows(AlunoException.class, () -> {
            sig.getControleAcademico().getAluno("Aluno não existe");
        });
    }

    @Test
    public void testTurmaException() { //para Professor não cadastrado na turma
        assertThrows(TurmaException.class, () -> {
            sig.getControleAcademico().definirProfessorNaDisciplina("Fabio", "Turma não existe");
        });
    }

    @Test
    public void testTurmaException2() { //Teste para turma não cadastrada
        assertThrows(TurmaException.class, () -> {
            sig.getControleAcademico().buscarTurma("Teste turma não existe");
        });
    }

    @Test
    public void testTurmaException3() { //para Aluno não cadastrado na turma
        assertThrows(TurmaException.class, () -> {
            sig.getControleAcademico().cadastrarAlunosNaDisciplina("Aluno Teste", "Turma não existe");
        });
    }
}
