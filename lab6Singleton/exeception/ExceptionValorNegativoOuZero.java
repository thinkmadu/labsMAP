package lab6Singleton.exeception;

public class ExceptionValorNegativoOuZero extends Exception {
    public ExceptionValorNegativoOuZero() {
        super("Valor invalido", new Throwable("Valor <= 0"));
    }
}
