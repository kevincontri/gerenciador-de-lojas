public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private int salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;

  public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.salarioBaseFuncionario = -1; // Valor padrão
  }

  public String getNome() {
    return nome;
  }

  public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
  }

  public int getSalarioBaseFuncionario() {
    return salarioBaseFuncionario;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public Data getDataFundacao() {
    return dataFundacao;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }

  @Override
  public String toString() {
    return "Loja \nNome: " + nome + "\nQuantidade de Funcionários: " + quantidadeFuncionarios
        + "\nSalário Base do Funcionário: " + salarioBaseFuncionario + "\nEndereço: " + endereco
        + "\nData de Fundação: " + dataFundacao;
  }

  public int gastosComSalario() {
    if (this.salarioBaseFuncionario < 0 || this.salarioBaseFuncionario == -1) {
      return -1; // Indica que o salário base não foi definido
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