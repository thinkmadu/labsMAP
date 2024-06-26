package lab5Fachada.sistema.infraestrutura;

import java.util.ArrayList;

import lab5Fachada.sistema.controleAcademico.auxiliar.Turma;
import lab5Fachada.sistema.infraestrutura.exceptions.SalaException;

public class Infraestrutura {
    public ArrayList<Sala> salas;

    public Infraestrutura() {
        this.salas = new ArrayList<>();
    }

    //Cadastro de salas
    public boolean cadastrarSala(int numero, String bloco, boolean disponivel) {
        Sala novaSala = new Sala(numero, bloco, disponivel);
        if (salas.contains(novaSala)) {
            return false;
        }
        this.salas.add(novaSala);
        return true;
    }

    //Lista com salas que nao estao ocupadas
    public String listarSalasDisponiveis() {
        StringBuilder salasTrue = new StringBuilder();
        for (Sala sala : salas) {
            if (sala.getDisponivel()) {
                salasTrue.append(sala.toString()).append("\n");
            }
        }
        return salasTrue.toString();
    }

    //Lista com todas as salas cadastradas
    public String mostrarSalas() {
        StringBuilder listaDeSalas = new StringBuilder();
        for (Sala sala : salas) {
            listaDeSalas.append(sala.toString()).append("\n");
        }
        return listaDeSalas.toString();
    }

    //Ocupa uma sala
    public boolean reservarSala(Turma turma, int numero, String bloco) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numero && sala.getBloco().equals(bloco)) {
                if(sala.getDisponivel()){
                    sala.setDisponivel(false);
                    return false;
                }
            }
        }
        return false;
    }

    public Sala getSala(int numero, String bloco) throws SalaException{
        for (Sala sala : salas) {
            if (sala.getNumero() == numero && sala.getBloco().equals(bloco)) {
                return sala;
            }
        }
        throw new SalaException(); //Sala nao existe
    }
}
