package lab3.Funcoes;

import lab3.interfaces.Funcao;

public class Roteirista implements Funcao{
    public String ocupacao;
    
    @Override
    public void ocupacao() {
        ocupacao = "Roteirista";
    }

    @Override
    public String toString() {
        return "Roteirista";
    }
}
