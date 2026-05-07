package app.main;

import app.utilities.Data;
import app.utilities.Endereco;

public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  private Produto[] estoqueProdutos;

  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao, int capacidadeEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[capacidadeEstoque];
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.salarioBaseFuncionario = -1.0; // Valor padrão
    this.estoqueProdutos = new Produto[capacidadeEstoque];
  }

  public String getNome() {
    return nome;
  }

  public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
  }

  public double getSalarioBaseFuncionario() {
    return salarioBaseFuncionario;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public Data getDataFundacao() {
    return dataFundacao;
  }

  public Produto[] getEstoqueProdutos() {
    return estoqueProdutos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }

  public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
  }

  @Override
  public String toString() {
    return "Loja \nNome: " + nome + "\nQuantidade de Funcionários: " + quantidadeFuncionarios
        + "\nSalário Base do Funcionário: " + salarioBaseFuncionario + "\nEndereço: " + endereco
        + "\nData de Fundação: " + dataFundacao + "\nCapacidade de Estoque: " + estoqueProdutos.length;
  }

  public double gastosComSalario() {
    if (this.salarioBaseFuncionario < 0 || this.salarioBaseFuncionario == -1.0) {
      return -1.0; // Indica que o salário base não foi definido
    } else {
      return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
    }
  }

  public char tamanhoDaLoja() {
    if (this.quantidadeFuncionarios < 10) {
      return 'P'; // Pequena
    } else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
      return 'M'; // Média
    } else {
      return 'G'; // Grande
    }
  }

  public void imprimeProdutos() {
    System.out.println("Produtos em estoque:");
    for (Produto produto : estoqueProdutos) {
      if (produto != null) {
        System.out.println("- " + produto.getNome() + " (Preço: " + produto.getPreco() + ", Validade: "
            + produto.getDataValidade() + ")");
      }
    }
  }

  public boolean insereProduto(Produto produto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
      if (estoqueProdutos[i] == null) {
        estoqueProdutos[i] = produto;
        return true;
      }
    }
    return false;
  }

  public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
      if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
        estoqueProdutos[i] = null; // Remove o produto do estoque
        return true; 
      }
    }
    return false; // Produto não existe no estoque
  }
}