public class Objeto {

  @Tabela("ANNOTATION")
  private String tabela;

  public Objeto(String tabela) {
    this.tabela = tabela;
  }

  public String getTabela() {
    return tabela;
  }
}
