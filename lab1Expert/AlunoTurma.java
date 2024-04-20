import java.util.ArrayList;

public class AlunoTurma {
    private Aluno aluno;
    private ArrayList<Turma> listaTurmas;

    public AlunoTurma(Aluno aluno) {
        this.aluno = aluno;
        this.listaTurmas = new ArrayList<Turma>();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void addTurma(Turma turma) throws NullPointerException, IllegalArgumentException {
        if (turma == null) {
            throw new NullPointerException("Turma não pode ser nula.");
        }

        if (listaTurmas.contains(turma)) {
            throw new IllegalArgumentException("Turma já cadastrada.");
        }

        this.listaTurmas.add(turma);
    }

    public String aulas() {
        try {
            if (aluno.getMatricula() == null) {
                throw new NullPointerException("Aluno não cadastrado");
            }

            StringBuilder todasAulas = new StringBuilder();
            todasAulas.append("Turmas do aluno ").append(aluno.getNome()).append(":\n");

            for (Turma turma : listaTurmas) {
                todasAulas.append("\nTurma: ").append(turma.getNome())
                        .append("\nDisciplina: ").append(turma.getDisciplina().getNome())
                        .append("\nHorário: ").append(turma.getHorario()).append("\n");
            }

            todasAulas.append("\n");

            return todasAulas.toString();
        } catch (NullPointerException e) {
            System.err.println("Erro ao obter aulas: " + e.getMessage());
            return "";
        }
    }
}
