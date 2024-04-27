package lab5Fachada.sistema.controleAcademico.exception;

public class TurmaException extends Exception{
    public TurmaException() {
        super("Turma não existe");
    }
}
