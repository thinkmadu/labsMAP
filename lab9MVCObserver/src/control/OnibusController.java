package control;

import model.Onibus;

public class OnibusController {
    private Onibus onibus;

    public OnibusController(Onibus onibus) {
        this.onibus = onibus;
    }

    public void reservarAssento(int numero) {
        if (onibus.reservarAssento(numero)) {
            System.out.println("Assento " + numero + " reservado com sucesso!");
        } else {
            System.out.println("Não foi possível reservar o assento " + numero);
        }
    }

    public void comprarAssento(int numero) {
        if (onibus.comprarAssento(numero)) {
            System.out.println("Assento " + numero + " comprado com sucesso!");
        } else {
            System.out.println("Não foi possível comprar o assento " + numero);
        }
    }
}
