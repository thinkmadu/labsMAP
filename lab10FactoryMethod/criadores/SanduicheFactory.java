package lab10FactoryMethod.criadores;
import lab10FactoryMethod.Produtos.*;

public interface SanduicheFactory {
    Pao criarPao();
    Queijo criarQueijo();
    Presunto criarPresunto();
    Ovo criarOvo();
    Tomate criarTomate();
    void montar();
}
