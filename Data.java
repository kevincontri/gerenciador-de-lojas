public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano) {
    if (validarData()) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    } else {
      this.dia = 1;
      this.mes = 1;
      this.ano = 2000; // Data padrão
      throw new IllegalArgumentException("Data inválida: " + dia + "/" + mes + "/" + ano);
    }
  }

  public boolean validarData() {
    if (mes == 2) { // Fevereiro
      if (verificaAnoBissexto()) {
        return dia <= 29; // Ano bissexto tem 29 dias em fevereiro
      } else {
        return dia <= 28; // Ano não bissexto tem 28 dias em fevereiro
      }
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // Meses com 30 dias
      return dia <= 30;
    } else { // Meses com 31 dias
      return dia <= 31;
    }
  }

  // Ano bissexto: é um ano que é divisível por 4, mas não é divisível por 100, a
  // menos que seja divisível por 400.
  public boolean verificaAnoBissexto() {
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
      return true; // É um ano bissexto
    } else {
      return false; // Não é um ano bissexto
    }
  }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + ano;
  }

}
