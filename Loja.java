public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;

  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Loja(String nome, int quantidadeFuncionarios) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1.0; // Valor padrão
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

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  @Override
  public String toString() {
    return "Loja \nNome: " + nome + "\nQuantidade de Funcionários: " + quantidadeFuncionarios
        + "\nSalário Base do Funcionário: " + salarioBaseFuncionario;
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
}