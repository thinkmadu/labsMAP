package lab2Creator;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Turma> turmas = new ArrayList<>();

    // construtor
    public Disciplina(String nome) {
        this.nome = nome;
    }

    // gets e sets
    public String getNome() {
        return nome;
    }

    // public void setNome(String nome) {
    // this.nome = nome;
    // }

    public List<Turma> getTurmas() {
        return turmas;
    }

    // public void setTurmas(List<Turma> turmas) {
    // this.turmas = turmas;
    // }

    public void addTurmaNaDisciplina(Turma turma) {
        try {
            if (turma == null) {
                throw new NullPointerException("Turma não pode ser nula");
            }

            if (turmas.contains(turma)) {
                throw new IllegalArgumentException("Turma já cadastrada");
            }

            turmas.add(turma);
        } catch (NullPointerException e) {
            System.err.println("Erro ao adicionar turma: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao adicionar turma: " + e.getMessage());
        }
    }

    public String qtdAlunos() {
        try {
            int totalAlunos = 0;
            for (Turma turma : turmas) {
                totalAlunos += turma.getAlunos().size();
            }

            return ("\nQuantidade de alunos na disciplina " + this.nome + ": " + totalAlunos);
        } catch (NullPointerException e) {
            System.err.println("Erro ao obter quantidade de alunos: " + e.getMessage());
            return "";
        }
    }

    public String alunos() {
        try {
            StringBuilder todosAlunos = new StringBuilder();
            todosAlunos.append("\nAlunos da disciplina " + this.nome + ":\n");

            for (Turma turma : turmas) {
                todosAlunos.append("Turma: " + turma.getNome() + "\n");
                for (Aluno aluno : turma.getAlunos()) {
                    todosAlunos.append(aluno.getNome() + " " + aluno.getMatricula() + "\n");
                }
                todosAlunos.append("\n");
            }

            return todosAlunos.toString();
        } catch (NullPointerException e) {
            System.err.println("Erro ao obter lista de alunos: " + e.getMessage());
            return "";
        }
    }
}
