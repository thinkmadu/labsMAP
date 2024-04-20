package lab2Creator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ana");
        Professor professor2 = new Professor("Julia");
	    Professor professor3 = new Professor("Giovanna");

	    Disciplina portugues = new Disciplina("14:00", "Português", "123", professor1);
	    Disciplina ingles = new Disciplina("16:00", "Inglês", "1234", professor2);
	    Disciplina matematica = new Disciplina("07:00", "Matematica", "12345", professor3);

	    Aluno aluno1 = new Aluno("João", "123456789");
	    Aluno aluno2 = new Aluno("Joana", "1234567");
	    Aluno aluno3 = new Aluno("Madu", "12345678");

	    ArrayList<Disciplina> disciplinas1 = new ArrayList<>();
	    ArrayList<Disciplina> disciplinas2 = new ArrayList<>();
	    ArrayList<Disciplina> disciplinas3 = new ArrayList<>();
	
        disciplinas1.add(portugues);
	    disciplinas2.add(ingles);
	    disciplinas3.add(matematica);

	    professor1.setDisciplinasMinistradas(disciplinas1);
	    professor2.setDisciplinasMinistradas(disciplinas2);
	    professor3.setDisciplinasMinistradas(disciplinas3);

	    aluno1.matricularDisciplina(portugues);
	    aluno2.matricularDisciplina(ingles);
	    aluno3.matricularDisciplina(matematica);

	    System.out.println(professor1.getHorarios());

	    System.out.println(professor1.getNomesDisciplinasMinistradas());
	    System.out.println(portugues.getAlunos());
    }
}
