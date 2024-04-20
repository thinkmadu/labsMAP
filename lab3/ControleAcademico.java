//a. Quais disciplinas um professor está ministrando;
//b. Qual o horário de um professor;
//c. Quais os alunos de uma dada disciplina;
//d. Quais as disciplinas de um aluno;
//e. Qual o horário de um aluno;
//f. Qual o número de alunos de uma disciplina.
public class ControleAcademico {
    public static void main(String[] args) {

      Disciplina disciplina1 = Creator.criarDisciplina("Física");
      Disciplina disciplina2 = Creator.criarDisciplina("Português");
      Disciplina disciplina3 = Creator.criarDisciplina("Filosofia");
      
      Professor professor1 = Creator.criarProfessor("Boris", "5555");
      Professor professor2 = Creator.criarProfessor("Clarice", "5432");
      Professor professor3 = Creator.criarProfessor("Kevin", "7222");

       Turma turma1 = Creator.criarTurma("Turma 1 de Física", professor1, "8:00", disciplina1);
       Turma turma2 = Creator.criarTurma("Turma 1 de Português", professor2, "10:00", disciplina2);
       Turma turma3 = Creator.criarTurma("Turma 1 de Filosofia", professor3, "14:00", disciplina3);
       Turma turma4 = Creator.criarTurma("Turma 2 de Filosofia", professor1, "16:00", disciplina3);

       professor1.getHorarios().adicionarTurma(turma1);
       professor1.getHorarios().adicionarTurma(turma4); 
      
       Aluno josefa = Creator.criarAluno("Josefa", "56456456");
       Aluno joao = Creator.criarAluno("João", "12345678");
       Aluno pedro = Creator.criarAluno("Pedro", "56789012");
       Aluno juliana = Creator.criarAluno("Juliana", "87654321");
       Aluno roberto = Creator.criarAluno("Roberto", "76543210");
       Aluno fernanda = Creator.criarAluno("Fernanda", "65432109");
       Aluno rafael = Creator.criarAluno("Rafael", "54321098");
       Aluno carlos = Creator.criarAluno("Carlos", "34567890");
       Aluno ana = Creator.criarAluno("Ana", "45678901");

       turma1.adicionarAluno(josefa);
       turma1.adicionarAluno(joao);
       turma1.adicionarAluno(pedro);
       
       turma2.adicionarAluno(josefa);
       turma2.adicionarAluno(juliana);
       turma2.adicionarAluno(roberto);
       turma2.adicionarAluno(fernanda);
       turma2.adicionarAluno(rafael);
       
       turma3.adicionarAluno(josefa);
       turma3.adicionarAluno(carlos);
       turma3.adicionarAluno(ana);

       turma4.adicionarAluno(juliana);
       turma4.adicionarAluno(roberto);
       turma4.adicionarAluno(fernanda);
       turma4.adicionarAluno(rafael);
        
        // é pra josefa ta nas turmas 1 de física, 1 de português, 1 de filosofia e 2 de filosofia 
        System.out.println(josefa.getAlunoTurma().aulas());

        //é pro professor1 estar em 2 turmas
        System.out.println(professor1.getHorarios().turmasMinistradas());

        //física tem 3 alunos
        System.out.println(disciplina1.qtdAlunos());

        //filosofia tem 7 alunos
        System.out.println(disciplina3.qtdAlunos());

        //printar os alunos da turma 1 e 2 de filosofia
        System.out.println(disciplina3.alunos());
    
     }
}