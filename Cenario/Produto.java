import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private static int contador;

    public Produto(String nomeProduto, double precoProduto, int quantidadeEstoqueProduto) {

        this.nome = nomeProduto;

        if (precoProduto < 0) {
            this.preco = 0;
            System.out.println("O preço não pode ser menor que 0.");
        } else {
            this.preco = precoProduto;
        }

        if (quantidadeEstoqueProduto < 0) {
            this.quantidadeEstoque = 0;
            System.out.println("A quantidade não pode ser menor que 0.");
        } else {
            this.quantidadeEstoque = quantidadeEstoqueProduto;
        }

        contador++;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double precoProduto) {
        if (precoProduto >= 0) {
            this.preco = precoProduto;
        } else {
            System.out.println("O preço não pode ser menor que 0.");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoqueProduto) {
        if (quantidadeEstoqueProduto >= 0) {
            this.quantidadeEstoque = quantidadeEstoqueProduto;
        } else {
            System.out.println("A quantidade não pode ser menor que 0.");
        }
    }

    public static void mostrarTotalProdutos() {
        System.out.printf("O total de produtos criados foi: %d%n", contador);
    }

    public double calcularValorEstoque() {
        return preco * quantidadeEstoque;
    }
}
