package app.stores;

import app.main.Loja;
import app.utilities.Data;
import app.utilities.Endereco;

public class Vestuario extends Loja {
  boolean produtosImportados;

  public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
      Data dataFundacao, boolean produtosImportados, int capacidadeEstoque) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
    this.produtosImportados = produtosImportados;
  }

  public boolean getProdutosImportados() {
    return produtosImportados;
  }

  public void setProdutosImportados(boolean produtosImportados) {
    this.produtosImportados = produtosImportados;
  }

  @Override
  public String toString() {
    return super.toString() + "\nProdutos Importados: " + produtosImportados;
  }
}
