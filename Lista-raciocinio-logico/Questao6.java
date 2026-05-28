//Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. Caso a média final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a mensagem reprovado”.
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double notaProva1;
  double notaProva2;
  double mediaProva;

  System.out.println("Informe o valor da sua primeira prova: ");
  notaProva1 = input.nextDouble();
  System.out.println("Informe o valor da sua segunda prova: ");
  notaProva2 = input.nextDouble();

  mediaProva = (notaProva1 + notaProva2) / 2;

  if (mediaProva>=7){
    System.out.println("Aprovado.");
  } else{
    System.out.println("Reprovado.");
  }
  
  
  input.close();
}
}
