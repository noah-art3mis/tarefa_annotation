public class Objeto {

  @Tabela("Nome da Tabela")
  private String tabela;

  public Objeto(String tabela) {
    this.tabela = tabela;
  }

  public String getTabela() {
    return tabela;
  }
}
