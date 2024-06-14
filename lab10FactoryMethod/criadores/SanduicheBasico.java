package lab10FactoryMethod.criadores;
import lab10FactoryMethod.ProdutosConcretos.*;
import lab10FactoryMethod.Produtos.*;


public class SanduicheBasico implements SanduicheFactory {
    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Ovo criarOvo() {
        return new OvoGranja();
    }

    @Override
    public Tomate criarTomate() {
        return new Tomate();
    }

    public void montar() {
        System.out.println("Sanduiche Basico");
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
        System.out.println("-------------------------");    }

}
