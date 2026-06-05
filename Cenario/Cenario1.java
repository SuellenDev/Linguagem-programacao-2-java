import java.util.Scanner;

public class void Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private static int contador;

    public Produto(String nomeProduto, float precoProduto, int quantidadeEstoqueProduto, int contadorProduto){
      this.nome = nomeProduto;
      this.preco = precoProduto;
      this.quantidadeEstoque = quantidadeEstoqueProduto;
      this.contador = contadorProduto;

      if (preco < 0){
        system.out.println("O preço não pode ser menor que 0.");
      }else{
        double precoProduto = scanner.nextDouble();
        
      }
      
    }

    public criarProduto(){
      
    }

    public double calcularValorestoque(){
      estoqueProduto = preco * quantidadeEstoqueProduto;
    }  
    Scanner.close();
  }
}
