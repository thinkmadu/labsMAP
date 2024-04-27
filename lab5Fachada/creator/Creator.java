package lab5Fachada.creator;
import lab5Fachada.sistema.*;

public class Creator {
    public Administracao administracao = new Administracao();
    public Financeiro financeiro = new Financeiro();
    public Professor professor = new Professor();
    public Aluno aluno = new Aluno();
    public Almoxarifado almoxarifado = new Almoxarifado();
    public Infraestrutura infraestrutura = new Infraestrutura();
}
