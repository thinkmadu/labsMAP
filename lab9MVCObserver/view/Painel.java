package lab9MVCObserver.view;

import lab9MVCObserver.model.Assento;
import lab9MVCObserver.model.Observer;
import lab9MVCObserver.model.Onibus;


public class Painel implements Observer {
    private Onibus onibus;

    public Painel(Onibus onibus) {
        this.onibus = onibus;
        this.onibus.addObserver(this);
    }

    @Override
    public void update() {
        exibir();
    }

    public void exibir() {
        System.out.println("Painel Central:");
        for (Assento assento : onibus.getAssentos()) {
            switch (assento.getStatus()) {
                case "disponivel":
                    System.out.print(" [V] ");
                    break;
                case "reservado":
                    System.out.print(" [R] ");
                    break;
                case "indisponivel":
                    System.out.print(" [X] ");
                    break;
            }
            if (assento.getNumero() % 4 == 0) {
                System.out.println(); // Nova linha a cada 4 assentos para simular a disposição no ônibus
            }
        }
        System.out.println();
    }
}
