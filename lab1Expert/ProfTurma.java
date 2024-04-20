import java.util.ArrayList;

public class ProfTurma {
    private Professor professor;
    private ArrayList<Turma> listaTurmas;

    // construtor
    public ProfTurma(Professor professor) {
        this.professor = professor;
        this.listaTurmas = new ArrayList<Turma>();
    }

    // gets e sets
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void adicionarTurma(Turma turma) throws NullPointerException, IllegalArgumentException {
        if (turma == null) {
            throw new NullPointerException("Turma não pode ser nula.");
        }

        if (turma.getProfessor() != null) {
            throw new IllegalArgumentException("Turma já possui professor.");
        }

        turma.setProfessor(professor);
        this.listaTurmas.add(turma);
    }

    public String turmasMinistradas() {
        try {
            if (professor == null) {
                throw new NullPointerException("Professor não cadastrado");
            }

            StringBuilder turmasTotais = new StringBuilder();
            turmasTotais.append("Turmas ministradas pelo professor ").append(professor.getNome()).append(":\n");

            for (Turma turma : listaTurmas) {
                turmasTotais.append("\nTurma: ").append(turma.getNome())
                        .append("\nDisciplina: ").append(turma.getDisciplina().getNome())
                        .append("\nHorário: ").append(turma.getHorario()).append("\n");
            }

            return turmasTotais.toString();
        } catch (NullPointerException e) {
            System.err.println("Erro ao obter turmas ministradas: " + e.getMessage());
            return "";
        }
    }
}
