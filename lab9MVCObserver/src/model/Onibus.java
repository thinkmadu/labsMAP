package model;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private List<Assento> assentos;
    private List<Observer> observers;

    public Onibus(int totalAssentos) {
        assentos = new ArrayList<>();
        observers = new ArrayList<>();
        for (int i = 1; i <= totalAssentos; i++) {
            assentos.add(new Assento(i));
        }
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public int getTotalAssentos() {
        return assentos.size();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public boolean reservarAssento(int numero) {
        Assento assento = getAssento(numero);
        if (assento == null) {
            throw new IllegalArgumentException("Assento " + numero + " não existe.");
        }
        if (assento.getStatus().equals("disponivel")) {
            assento.setStatus("reservado");
            notifyObservers();
            return true;
        }
        return false;
    }

    public boolean comprarAssento(int numero) {
        Assento assento = getAssento(numero);
        if (assento == null) {
            throw new IllegalArgumentException("Assento " + numero + " não existe.");
        }
        if (assento.getStatus().equals("disponivel") || assento.getStatus().equals("reservado")) {
            assento.setStatus("indisponivel");
            notifyObservers();
            return true;
        }
        return false;
    }

    public boolean isAssentoReservado(int numero) {
        Assento assento = getAssento(numero);
        return assento != null && assento.getStatus().equals("reservado");
    }

    public boolean isAssentoComprado(int numero) {
        Assento assento = getAssento(numero);
        return assento != null && assento.getStatus().equals("indisponivel");
    }

    private Assento getAssento(int numero) {
        for (Assento assento : assentos) {
            if (assento.getNumero() == numero) {
                return assento;
            }
        }
        return null;
    }
}
