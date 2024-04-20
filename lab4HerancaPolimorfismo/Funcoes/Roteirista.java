package lab4HerancaPolimorfismo.Funcoes;

import lab4HerancaPolimorfismo.interfaces.Funcao;

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
