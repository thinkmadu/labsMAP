package lab9MVCObserver.model;

public class Assento {
    private int numero;
    private String status;

    public Assento(int numero) {
        this.numero = numero;
        this.status = "disponivel";
    }

    public int getNumero() {
        return numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
