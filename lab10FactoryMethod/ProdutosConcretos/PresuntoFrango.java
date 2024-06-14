package lab10FactoryMethod.ProdutosConcretos;

import lab10FactoryMethod.Produtos.Presunto;
public class PresuntoFrango implements Presunto{
    @Override
	public void adicionarPresunto() {
		System.out.println("Adicionando presunto de frango");	}
}
