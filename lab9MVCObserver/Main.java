package lab9MVCObserver;
import java.util.Scanner;

import lab9MVCObserver.control.OnibusController;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnibusController controller = new OnibusController(10); 

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Comprar assento");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 3) {
                break;
            }

            System.out.println("Digite o número do assento:");
            int assento = scanner.nextInt();

            try {
                if (opcao == 1) {
                    System.out.println(controller.reservarAssento(assento));
                } else if (opcao == 2) {
                    System.out.println(controller.comprarAssento(assento));
                } else {
                    System.out.println("Opção inválida.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
