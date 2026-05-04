public class Produto {
  private String nome;
  private double preco;
  private Data dataValidade;

  public Produto(String nome, double preco, Data dataValidade) {
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public Data getDataValidade() {
    return dataValidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
  }

  public boolean estaVencido(Data dataAtual) {
    if (dataValidade.getAno() < dataAtual.getAno()) {
      return true; // Produto vencido
    } else if (dataValidade.getAno() == dataAtual.getAno()) {
      if (dataValidade.getMes() < dataAtual.getMes()) {
        return true; // Produto vencido
      } else if (dataValidade.getMes() == dataAtual.getMes()) {
        return dataValidade.getDia() < dataAtual.getDia(); // Vencido se o dia de validade for menor que o dia atual
      }
    }
    return false; // Produto não vencido
  }

  @Override
  public String toString() {
    return "Produto \nNome: " + nome + "\nPreço: " + preco + "\nData de Validade: " + dataValidade;
  }
}
