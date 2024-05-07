package lab6Singleton.exeception;

public class ExceptionViolacaoDesigualdade extends Exception{
    public ExceptionViolacaoDesigualdade(){
        super("Violacao da desigualdade triangular", new Throwable("A soma de dois lados de um triangulo deve ser maior que o terceiro lado"));
    }
}
