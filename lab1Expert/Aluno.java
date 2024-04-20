public class Aluno {
    private String nome;
    private String matricula;
    private AlunoTurma horarios;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.horarios = new AlunoTurma(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public AlunoTurma getAlunoTurma() {
        try {
            // Verificação se 'horarios' está nulo
            if (horarios == null) {
                throw new NullPointerException("Variável 'horarios' não inicializada.");
            }

            // Verificação se 'horarios' é do tipo 'AlunoTurma'
            if (!(horarios instanceof AlunoTurma)) {
                throw new ClassCastException("Variável 'horarios' não é do tipo 'AlunoTurma'.");
            }

            return horarios;
        } catch (NullPointerException e) {
            System.err.println("Erro: " + e.getMessage());
            return null;
        } catch (ClassCastException e) {
            System.err.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
