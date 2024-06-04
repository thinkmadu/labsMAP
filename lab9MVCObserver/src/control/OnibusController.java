package control;

import model.Onibus;

public class OnibusController {
    private Onibus onibus;

    public OnibusController(int totalAssentos) {
        this.onibus = new Onibus(totalAssentos);
    }

    public String reservarAssento(int assento) {
        if (assento < 1 || assento > onibus.getTotalAssentos()) {
            throw new IllegalArgumentException("Assento " + assento + " não existe.");
        }

        if (onibus.isAssentoReservado(assento)) {
            return "Não foi possível reservar o assento " + assento;
        } else if (onibus.reservarAssento(assento)) {
            return "Assento " + assento + " reservado com sucesso!";
        } else {
            return "Não foi possível reservar o assento " + assento;
        }
    }

    public String comprarAssento(int assento) {
        if (assento < 1 || assento > onibus.getTotalAssentos()) {
            throw new IllegalArgumentException("Assento " + assento + " não existe.");
        }

        if (onibus.isAssentoComprado(assento)) {
            return "Não foi possível comprar o assento " + assento;
        } else if (onibus.comprarAssento(assento)) {
            return "Assento " + assento + " comprado com sucesso!";
        } else {
            return "Não foi possível comprar o assento " + assento;
        }
    }
}
