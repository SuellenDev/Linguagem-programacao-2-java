//Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua idade e informe se o mesmo já pode tirar carteira de motorista. O usuário somente poderá tirar a carteira de motorista se a idade for maior que 18 anos. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){

  int idade;
  
  Scanner input = new Scanner (System.in);
  System.out.println("Qual a sua idade?");
  idade = input.nextInt();

  if (idade<18){
    System.out.println("\nVocê não pode tirar a carteira de habilitação por ser menor de idade.");
  } else {
    System.out.println("\nVocê pode tirar a carteira de habilitação.");
  }
  
  
}
}
