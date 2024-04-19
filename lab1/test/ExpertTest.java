import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExpertTest {
    Professor professor1 = new Professor("Ana");
    Professor professor2 = new Professor("Julia");
    Professor professor3 = new Professor("Giovanna");

    Disciplina portugues = new Disciplina("14:00", "Português", "123", professor1);
    Disciplina ingles = new Disciplina("16:00", "Inglês", "1234", professor2);
    Disciplina matematica = new Disciplina("07:00", "Matematica", "12345", professor3);

    Aluno aluno1 = new Aluno("João", "123456789");
    Aluno aluno2 = new Aluno("Joana", "1234567");
    Aluno aluno3 = new Aluno("Madu", "12345678");

    @Test
    public void studentValidation(){
        assertEquals("João", aluno1.getNome());
        assertEquals("123456789", aluno1.getMatricula());
        assertNotSame("Mariquinha", aluno1.getNome());
        assertNotEquals("56756", aluno1.getMatricula());
    }

    @Test
    public void testGetHorario() {
        aluno2.setHorario("1234","08:00");
        assertNotNull(aluno2.getHorario());
        assertEquals(1, aluno2.getHorario().size());
        assertEquals("08:00", aluno2.getHorario().get(0));
    }

    @Test
    public void classCreation(){
        ArrayList<Disciplina> disciplinasMinistradas = new ArrayList<>();
        Professor professor = new Professor("Misael",disciplinasMinistradas);
        Disciplina disciplina = new Disciplina("manhã","Biologia","6456",professor);

        disciplinasMinistradas.add(disciplina);

        assertEquals("Biologia",disciplina.getNome());
        assertEquals("manhã",disciplina.getHorario());
        assertEquals("6456",disciplina.getCodigo());
        assertEquals(professor,disciplina.getProfessor());
        assertNotSame("Valesca", disciplina.getProfessor().getNome());
        assertTrue(disciplinasMinistradas.contains(disciplina));
    }
}
