//Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a mensagem apropriada. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  int numero1;
  int numero2;

  System.out.println("Digite um número (inteiro) qualquer.");
  numero1 = input.nextInt();
  System.out.println("Digite o segundo número (inteiro).");
  numero2 = input.nextInt();

  if (numero1>numero2){
    System.out.printf("O primeiro número %d é o maior número.", numero1);
  } else{
    System.out.printf("O segundo número %d é o maior número.", numero2);
  }

  
  input.close();
}
}
