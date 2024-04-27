package lab5Fachada.sistema.infraestrutura.exceptions;

public class SalaException extends Exception {
    public SalaException() {
        super("Sala não existe");
    } 
}
