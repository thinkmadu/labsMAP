import model.Onibus;
import view.Painel;
import view.Quiosque;
import control.OnibusController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(16); // Exemplo com 16 assentos
        Painel painel = new Painel(onibus);
        Quiosque quiosque = new Quiosque(onibus);
        OnibusController controller = new OnibusController(onibus);
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Escolha uma ação: 1. Reservar 2. Comprar 3. Sair");
            int acao = scanner.nextInt();
            
            if (acao == 3) {
                break;
            }
            
            System.out.println("Digite o número do assento:");
            int numero = scanner.nextInt();
            
            if (acao == 1) {
                controller.reservarAssento(numero);
            } else if (acao == 2) {
                controller.comprarAssento(numero);
            }
        }
        
        scanner.close();
    }
}
