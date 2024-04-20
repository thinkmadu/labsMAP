package lab4HerancaPolimorfismo.Funcoes;

import lab4HerancaPolimorfismo.interfaces.Funcao;

public class Diretor implements Funcao{
    public String ocupacao;
    
    @Override
    public void ocupacao() {
        ocupacao = "Diretor";
    }

    @Override
    public String toString() {
        return "Diretor";
    }
}
