peckage sistemaBiblioteca;

public class Livro{
  public String titulo;
  public Autor autor;
  public String dataPublicao;
  public String descricao;
  public String codigo;
  public String status;

  public Livro(String titulo, Autor autor, String dataPublicacao, String descricao, String codigo, String status){
    this.titulo = titulo;
    this.autor = autor;
    this.dataPublicacao = dataPublicacao;
    this.descricao = descricao;
    this.codigo = codigo;
    this.status = status;
  }
  
}
