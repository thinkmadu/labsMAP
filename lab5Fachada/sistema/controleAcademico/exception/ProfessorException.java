package lab5Fachada.sistema.controleAcademico.exception;

public class ProfessorException extends Exception{
    public ProfessorException() {
        super("Professor não existe");
    }
}
