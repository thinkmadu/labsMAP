package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Queijo;
public class QueijoMussarela implements Queijo{
    @Override
	public void adicionarQueijo() {
		System.out.println("Adicionando queijo mussarela");	
	}
}
