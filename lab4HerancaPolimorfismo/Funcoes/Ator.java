package lab4HerancaPolimorfismo.Funcoes;

import lab4HerancaPolimorfismo.interfaces.Funcao;

public class Ator implements Funcao{
    public String ocupacao;
    
    @Override
    public void ocupacao() {
        ocupacao = "Ator";
    }

    @Override
    public String toString() {
        return "Ator";
    }
}
