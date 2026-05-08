
import java.util.Scanner;

import app.main.Loja;
import app.main.Produto;
import app.utilities.Data;
import app.utilities.Endereco;

import java.util.Locale;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); // Configura o Scanner para usar o formato de número dos EUA
    int opcao = 1;
    boolean executando = opcao == 1 || opcao == 2;

    while (executando) {
      do {
        if (opcao != 1 && opcao != 2 && opcao != 3) {
          System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
        }
        System.out.print("\n(1) Criar uma loja\n(2) Criar um produto\n(3) Sair\nEscolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada
      } while (opcao != 1 && opcao != 2 && opcao != 3);

      if (opcao == 1) {
        System.out.print("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();
        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada
        System.out.print("Digite o salário base dos funcionários: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer de entrada
        System.out.print("Digite a capacidade do estoque: ");
        int capacidadeEstoque = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada
        System.out.print("\nDigite o endereço da loja:\nNome da rua: ");
        String nomeDaRua = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();

        System.out.print("\nDigite a data de fundação da loja:\nDia: ");
        int diaFundacao = scanner.nextInt();
        System.out.print("Mês: ");
        int mesFundacao = scanner.nextInt();
        System.out.print("Ano: ");
        int anoFundacao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

        Loja loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);

        System.out.println(loja.toString());
      } else if (opcao == 2) {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer de entrada

        System.out.print("Digite a data de validade do produto:\nDia: ");
        int diaValidade = scanner.nextInt();
        System.out.print("Mês: ");
        int mesValidade = scanner.nextInt();
        System.out.print("Ano: ");
        int anoValidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

        Produto produto = new Produto(nomeProduto, precoProduto, dataValidade);

        System.out.print("\nA data atual é: 20/10/2023\nSituação do produto em relação à data atual:\n");
        int diaAtual = 20;
        int mesAtual = 10;
        int anoAtual = 2023;

        Data dataAtual = new Data(diaAtual, mesAtual, anoAtual);

        verificarValidade(produto, dataAtual);

        System.out.println("\n" + produto.toString());
      } else if (opcao == 3) {
        System.out.println("Encerrando o programa. Obrigado por usar!");
        executando = false;
      }
    }

    scanner.close();
  }

  public static void verificarValidade(Produto produto, Data dataAtual) {
    if (produto.estaVencido(dataAtual)) {
      System.out.println("PRODUTO VENCIDO");
    } else {
      System.out.println("PRODUTO NÃO VENCIDO");
    }
  }
}
