public class Professor {
    private String nome;
    private String matricula;
    private ProfTurma horarios;

    // construtor
    public Professor(String nome, String matricula) {

        this.nome = nome;
        this.matricula = matricula;
        this.horarios = new ProfTurma(this);
    }

    // gets e sets
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

    public ProfTurma getHorarios() {
        try {
            if (horarios == null) {
                throw new NullPointerException("Variável 'horarios' não inicializada.");
            }

            if (!(horarios instanceof ProfTurma)) {
                throw new ClassCastException("Variável 'horarios' não é do tipo 'ProfTurma'.");
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

    public void setHorarios(ProfTurma horarios) {
        this.horarios = horarios;
    }
}