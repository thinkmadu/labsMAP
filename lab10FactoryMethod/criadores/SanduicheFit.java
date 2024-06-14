package lab10FactoryMethod.criadores;
import lab10FactoryMethod.ProdutosConcretos.*;
import lab10FactoryMethod.Produtos.*;


public class SanduicheFit implements SanduicheFactory {
    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public Ovo criarOvo() {
        return new OvoCapoeira();
    }

    @Override
    public Tomate criarTomate() {
        return new Tomate();
    }

    public void montar() {
        System.out.println("Sanduiche Fit");
        Pao pao = criarPao();
        pao.adicionarPao();

        Queijo queijo = criarQueijo();
        queijo.adicionarQueijo();

        Presunto presunto = criarPresunto();
        presunto.adicionarPresunto();

        Ovo ovo = criarOvo();
        ovo.adicionarOvo();

        Tomate tomate = criarTomate();
        tomate.adicionarTomate();
        System.out.println("-------------------------");

    }

}
