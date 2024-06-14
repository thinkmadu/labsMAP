package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Pao;
public class PaoFrances implements Pao{
    @Override
	public void adicionarPao() {
		System.out.println("Adicionando pão francês");	}
}
