package lab4HerancaPolimorfismo;

import java.util.ArrayList;

public class Filme {
    public String titulo;
    public String ano;
    public String genero;
    public ArrayList<Funcionario> funcionarios;

    public Filme(String titulo, String ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.funcionarios = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setPublisher(String publisher) {
        this.genero = publisher;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Funcionario adicionarFuncionario(String nome, String id) {
        Funcionario novoFuncionario = new Funcionario(
            nome,
            id
        );

        for (Funcionario funcionario: funcionarios) {
            if (funcionario.getId().equals(novoFuncionario.getId())) {
                throw new IllegalArgumentException(("funcionário já registrado!"));
            }
        }
        funcionarios.add(novoFuncionario);
        return novoFuncionario;
    }
}
