import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Produto produto1 = new Produto("HD", 250, 10);
        Produto produto2 = new Produto("SSD", 630, 5);
        Produto produto3 = new Produto("Placa mãe", 400, 2);

        System.out.println(produto1.getNome() + " - Estoque: " + pproduto1.calcularValorEstoque());
        System.out.println(produto2.getNome() + " - Estoque: " + produto2.calcularValorEstoque());
        System.out.println(produto3.getNome() + " - Estoque: " + produto3.calcularValorEstoque());

        Produto.mostrarTotalProdutos();

        Produto produto4 = new Produto("Produto teste", -500, -59);
    }
}
