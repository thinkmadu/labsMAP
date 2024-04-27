package lab5Fachada.sistema.administração;

import java.time.LocalDateTime;

public class Administracao {
    private Agenda agenda;

    public Administracao() {
        this.agenda = new Agenda();
    }

    public Agenda getAgenda(){
        return this.agenda;
    }
    
    public void setAgenda(Agenda agenda){
        this.agenda = agenda;
    }

    // MÉTODOS
    public boolean agendarReuniaoDaDiretoria(LocalDateTime dataDaReuniao) {
        return this.agenda.agendarReuniao(dataDaReuniao);
    }

    public boolean agendarEntrevista(LocalDateTime dataDaEntrevista) {
        return this.agenda.agendarEntrevista(dataDaEntrevista);
    }

    public String reunioesAgendadasDiretoria(){
        return this.agenda.mostrarReunioesDiretoria();
    }

    public String entrevistasAgendadas() {
        return this.agenda.mostrarEntrevistas();
    }
}
