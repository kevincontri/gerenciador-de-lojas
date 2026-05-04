import java.text.Normalizer;

public class Shopping {
  String nome;
  Endereco endereco;
  Loja[] lojas;

  public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
    this.nome = nome;
    this.endereco = endereco;
    this.lojas = new Loja[quantidadeLojas];
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Loja[] getLojas() {
    return lojas;
  }

  public void setLojas(Loja[] lojas) {
    this.lojas = lojas;
  }

  @Override
  public String toString() {
    return "Shopping \nNome: " + nome + "\nEndereço: " + endereco + "\nQuantidade de Lojas: " + lojas.length;
  }

  public boolean insereLoja(Loja loja) {
    for (int i = 0; i < lojas.length; i++) {
      if (lojas[i] == null) {
        lojas[i] = loja;
        return true;
      }
    }
    return false; // Não há espaço para inserir a loja
  }

  public boolean removeLoja(String nomeLoja) {
    for (int i = 0; i < lojas.length; i++) {
      if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
        lojas[i] = null; // Remove a loja do shopping
        return true;
      }
    }
    return false; // Loja não encontrada
  }

  public int quantidadeLojasPorTipo(String tipoLoja) {
    if (tipoLoja == "Informática") { // Normaliza o nome do tipo de loja para comparação e evitar erros de digitação
      tipoLoja = "Informatica";
    } else if (tipoLoja == "Cosmético") {
      tipoLoja = "Cosmetico";
    } else if (tipoLoja == "Vestuário") {
      tipoLoja = "Vestuario";
    }
    int count = 0;
    for (Loja loja : lojas) {
      if (loja != null && loja.getClass().getSimpleName().equalsIgnoreCase(tipoLoja)) {
        count++;
      }
    }
    if (count == 0) {
      return -1; // Tipo de loja não encontrado
    } else {
      return count;
    }
  }

  public Informatica lojaSeguroMaisCaro() {
    Informatica lojaMaisCara = null;
    double maiorSeguro = -1.0;

    for (Loja loja : lojas) {
      if (loja instanceof Informatica) {
        Informatica informatica = (Informatica) loja;
        if (informatica.getSeguroEletronicos() > maiorSeguro) {
          maiorSeguro = informatica.getSeguroEletronicos();
          lojaMaisCara = informatica;
        }
      }
    }

    return lojaMaisCara; // Retorna a loja de informática com o seguro mais caro ou null se não houver
                         // lojas de informática
  }
}
