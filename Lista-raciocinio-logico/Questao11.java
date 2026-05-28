//Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário o valor do resultado deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o usuário. import java.util.Scanner;
import java.util.Scanner;
public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double valor1;
  double valor2;
  double valorFinal;

  System.out.println("Digite o primeiro valor: ");
  valor1 = input.nextDouble();
  System.out.println("\nDigite o segundo valor: ");
  valor2 = input.nextDouble();

  valorFinal = valor1 + valor2;

  if (valorFinal >= 10){
    valorFinal = valorFinal + 5;
    System.out.printf("\nO valor final: %.2f", valorFinal);
  } else {
    valorFinal = valorFinal - 7;
    System.out.printf("\nO valor final: %.2f", valorFinal);
  }
  
  input.close();
}
}
