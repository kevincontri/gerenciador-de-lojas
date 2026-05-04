import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = 1;

    do {
      if (opcao != 1 && opcao != 2 && opcao != 3) {
        System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
      }
      System.out.print("\n(1) Criar uma loja\n(2) Criar um produto\n(3) Sair\nEscolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine(); // Limpa o buffer de entrada
    } while (opcao != 1 && opcao != 2 && opcao != 3);
    
  }
}
