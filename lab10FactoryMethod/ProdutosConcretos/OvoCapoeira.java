package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Ovo;
public class OvoCapoeira implements Ovo{
	@Override
	public void adicionarOvo() {
		System.out.println("Adicionando ovo caipira");
	}
}
