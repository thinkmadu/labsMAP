package elementosConcretos;

import exceptions.BaseMaiorException;
import exceptions.NegativoException;
import visitor.VisitorIF;

public interface ElementoConcretoIF {
    void aceitaVisita(VisitorIF v) throws NegativoException, BaseMaiorException;
}
