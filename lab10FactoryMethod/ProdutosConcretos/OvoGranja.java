package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Ovo;
public class OvoGranja implements Ovo{
    @Override
	public void adicionarOvo() {
		System.out.println("Adicionando ovo de granja");	}
}
