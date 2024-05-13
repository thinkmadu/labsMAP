package exceptions;

public class NegativoException extends Exception{
    public NegativoException() {
        super("Não é permitido utilizar valores negativos");
    }
}
