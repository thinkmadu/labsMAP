package lab3.Funcoes;

import lab3.interfaces.Funcao;

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
