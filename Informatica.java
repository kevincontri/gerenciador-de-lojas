class Informatica extends Loja {
  double seguroEletronicos;

  public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao, int capacidadeEstoque, double seguroEletronicos) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
    this.seguroEletronicos = seguroEletronicos;
  }

  public double getSeguroEletronicos() {
    return seguroEletronicos;
  }

  public void setSeguroEletronicos(double seguroEletronicos) {
    this.seguroEletronicos = seguroEletronicos;
  }

  @Override
  public String toString() {
    return super.toString() + "\nSeguro para Eletrônicos: " + seguroEletronicos;
  }
}
