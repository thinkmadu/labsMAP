package lab4HerancaPolimorfismo;

import lab4HerancaPolimorfismo.interfaces.Funcao;
import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String id;
    private ArrayList<String> jobs;

    private ArrayList<Funcao> ocupacoes;

    public Funcionario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.ocupacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    public ArrayList<Funcao> getOcupacoes() {
        return ocupacoes;
    }

    public void setOcupacao(Funcao ocupacao) {
        for (Funcao existingOccupation : ocupacoes) {
            if (existingOccupation.equals(ocupacao)) {
                throw new IllegalArgumentException("O funcionário já possui essa ocupação!");
            }
        }
        ocupacoes.add(ocupacao);
    }
}
