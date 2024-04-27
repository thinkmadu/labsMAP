package lab5Fachada;

import lab5Fachada.sistema.financeiro.Financeiro;
import lab5Fachada.sistema.controleAcademico.ControleAcademico;
import lab5Fachada.sistema.almoxarifado.Almoxarifado;
import lab5Fachada.sistema.infraestrutura.Infraestrutura;
import lab5Fachada.sistema.administração.Administracao;


public class SIG {
    final private Financeiro financeiro;
    final private Administracao administracao;
    final private ControleAcademico controleAcademico;
    final private Almoxarifado almoxarifado;
    final private Infraestrutura infraEstrutura;

    public SIG() {
        this.financeiro = new Financeiro();
        this.administracao = new Administracao();
        this.controleAcademico = new ControleAcademico();
        this.almoxarifado = new Almoxarifado();
        this.infraEstrutura = new Infraestrutura();
    }

    public Financeiro getFinanceiro() {

        return this.financeiro;
    }

    public Administracao getAdministracao() {
        return this.administracao;
    }

    public ControleAcademico getControleAcademico() {

        return this.controleAcademico;
    }

    public Almoxarifado getAlmoxarifado() {

        return this.almoxarifado;
    }

    public Infraestrutura getInfraestrutura() {

        return this.infraEstrutura;
    }
}
