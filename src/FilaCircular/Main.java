package FilaCircular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da fila: ");
        int size = scanner.nextInt();
        CircularQueue<Integer> queue = new CircularQueue<>(size);

        int opcao = -1;
        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para adicionar: ");
                    int item = scanner.nextInt();
                    queue.add(item);
                    break;
                case 2:
                    Integer removedItem = queue.remove();
                    if (removedItem != null) {
                        System.out.println("Item removido: " + removedItem);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
