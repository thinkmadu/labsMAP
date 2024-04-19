package lab3.Funcoes;

import lab3.interfaces.Funcao;

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
