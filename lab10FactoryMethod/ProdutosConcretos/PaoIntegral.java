package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Pao;
public class PaoIntegral implements Pao{
	@Override
	public void adicionarPao() {
		System.out.println("Adicionando pão integral");	}
}
