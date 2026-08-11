import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {

            System.out.print("Digite a idade do condutor: ");
            int idade = entrada.nextInt();

            System.out.print("Digite o valor do veículo: ");
            double valorCarro = entrada.nextDouble();

            if (idade < 18) {
                throw new IdadeInvalidaException("Idade inválida.");
            }

            if (valorCarro <= 0) {
                throw new IllegalArgumentException("Valor inválido.");
            }

            double seguro = valorCarro * 0.05;

            if (idade < 25) {
                seguro = seguro + (valorCarro * 0.02);
            }

            System.out.printf("Valor do seguro: R$ %.2f%n", seguro);

        } catch (IdadeInvalidaException e) {

            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {

            System.out.println("Finalizado.");

        }

        entrada.close();
    }
}
