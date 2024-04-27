package lab5Fachada;
import lab5Fachada.creator.Creator;

public class Fachada {
    public String realizarOperacoes(){
        Creator creator = new Creator();
        System.out.println("---Aba da administração ---");
        System.out.println(creator.administracao.agendarReuniao("01/01/2021", "10:00", "Sala 1"));
        System.out.println(creator.administracao.agendarEntrevista("02/01/2021", "11:00", "Sala 2"));
        System.out.println();
        System.out.println("---Aba do aluno ---");
        System.out.println(creator.aluno.historico());
        System.out.println(creator.aluno.rdm());
        System.out.println();
        System.out.println("---Aba do almoxarifado ---");
        System.out.println(creator.almoxarifado.estoque());
        System.out.println(creator.almoxarifado.pedidoCompra());
        System.out.println();
        System.out.println("---Aba do financeiro ---");
        System.out.println(creator.financeiro.balancoContas());
        System.out.println(creator.financeiro.folhaPagamento());
        System.out.println();
        System.out.println("---Aba da infraestrutura ---");
        System.out.println(creator.infraestrutura.alocacaoSalas());
        System.out.println(creator.infraestrutura.agendarManutencao("03/01/2021", "12:00", "Sala 3"));
        System.out.println();
        System.out.println("---Aba do professor ---");
        System.out.println(creator.professor.alocacaoDisciplina());
        System.out.println(creator.professor.tempoCasa());
        System.out.println();
        return "Operações realizadas";
    }
}
