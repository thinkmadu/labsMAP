package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Presunto;

public class PresuntoPeru implements Presunto{
	@Override
	public void adicionarPresunto() {
		System.out.println("Adicionando presunto de peru");	
	}
}
