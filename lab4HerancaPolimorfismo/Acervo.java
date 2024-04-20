package lab4HerancaPolimorfismo;

import java.util.ArrayList;
import lab4HerancaPolimorfismo.interfaces.Funcao;

public class Acervo {
    public ArrayList<Filme> filmes;

    public Acervo() {
        this.filmes = new ArrayList<>();
    }

    public Filme adicionarFilme(String titulo, String ano, String genero) {
        Filme novoFilme = new Filme(
            titulo,
            ano,
            genero
        );

        for (Filme filme: filmes) {
            if (filme.getTitulo().equals(novoFilme.getTitulo())) {
                throw new IllegalArgumentException("Filme já existe!");
            }
        }
        filmes.add(novoFilme);
        return novoFilme;
    }

    public void mostrarFilmes() {
        for (Filme filme : filmes) {
            System.out.println("Filme: " + filme.getTitulo() + " {");
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Ano: " + filme.getAno());
            System.out.println();

            var funcionarios = filme.getFuncionarios();

            System.out.println();
            System.out.println("-- Funcionário --");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + ":");
            
            for (Funcao ocupacao : funcionario.getOcupacoes()) {
                System.out.println("- " + ocupacao);
            }
            System.out.println();
        }
        System.out.println("}");
        System.out.println();
    }
}
}
