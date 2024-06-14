package lab9MVCObserver.view;

import lab9MVCObserver.model.*;

public class Quiosque implements Observer {
    private Onibus onibus;

    public Quiosque(Onibus onibus) {
        this.onibus = onibus;
        this.onibus.addObserver(this);
    }

    @Override
    public void update() {
        exibir();
    }

    public void exibir() {
        System.out.println("Quiosque:");
        for (Assento assento : onibus.getAssentos()) {
            System.out.println("Assento " + assento.getNumero() + ": " + assento.getStatus());
        }
        System.out.println();
    }
}
