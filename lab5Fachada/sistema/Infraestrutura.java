package lab5Fachada.sistema;

public class Infraestrutura {
    public String alocacaoSalas(){
        return "Alocação de salas";
    }
    public String agendarManutencao(String data, String hora, String local){
        return "Manutenção agendada para " + data + " às " + hora + " no(a) " + local;
    }
}
