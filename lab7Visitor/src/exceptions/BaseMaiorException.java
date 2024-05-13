package exceptions;

public class BaseMaiorException extends Exception{
    public BaseMaiorException(){
        super("O valor da base maior precisa ser maior que o valor da base menor");
    }
}
