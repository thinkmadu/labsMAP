package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Queijo;
public class QueijoCheddar implements Queijo{
    @Override
	public void adicionarQueijo() {
		System.out.println("Adicionando queijo cheddar");	
	}
}
