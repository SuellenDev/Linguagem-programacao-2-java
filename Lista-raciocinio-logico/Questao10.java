//Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e apresentar o resultado caso seja maior que 10. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double valor1;
  double valor2;
  double soma;
  
  System.out.println("Digite o primeiro valor.");
  valor1 = input.nextDouble();
  System.out.println("Digite o segundo valor.");
  valor2 = input.nextDouble();

  soma = valor1 + valor2;

  if (soma > 10){
    System.out.println("O resultado é: %.2f", soma);
  }
  
  input.close();
}
}
