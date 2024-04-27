package lab5Fachada.sistema.controleAcademico.exception;

public class AlunoException extends Exception{
    public AlunoException() {
        super("Aluno não existe");
    }
}
