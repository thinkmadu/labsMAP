package lab4HerancaPolimorfismo;

import lab4HerancaPolimorfismo.Funcoes.*;

public class Main {
    public static void main(String[] args) {
        Acervo collection = new Acervo();

        Filme filme1 = collection.adicionarFilme("Avatar", "2009", "Action");
        Filme filme2 = collection.adicionarFilme("Tropa de Elite", "2007", "Action");
        Filme filme3 = collection.adicionarFilme("Avengers", "2012", "Action");

        Funcionario funcionario1 = filme1.adicionarFuncionario("Douglas", "1234");
        Funcionario funcionario2 = filme2.adicionarFuncionario("Fernanda", "12345");
        Funcionario funcionario3 = filme3.adicionarFuncionario("Lucio", "123456");

        funcionario1.setOcupacao(new Ator());
        funcionario1.setOcupacao(new Roteirista());

        funcionario2.setOcupacao((new Diretor()));

        funcionario3.setOcupacao(new Ator());
        funcionario3.setOcupacao(new Roteirista());
        funcionario3.setOcupacao(new Diretor());

        collection.mostrarFilmes();
    }
}
