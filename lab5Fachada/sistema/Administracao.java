package lab5Fachada.sistema;

public class Administracao {
    public String agendarReuniao(String data, String hora, String local) {
        return "Reunião agendada para " + data + " às " + hora + " no(a) " + local;
    }

    public String agendarEntrevista(String data, String hora, String local) {
        return "Entrevista agendada para " + data + " às " + hora + " no(a) " + local;
    }
}
