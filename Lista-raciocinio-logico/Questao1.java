//Contruir um algoritmo que solicite ao usu[ario a quantidade de horas trabalhadas no mês por um operário. Em seguida, calcular e informar o seu salãrio sabendo que ele ganha R$20,00 por hora.
import java.util.Scanner;
public class Main {
public static void main(String [] args){
  Scanner input = new Scanner (System.in);
  System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
  double horastb = input.nextDouble();
  double finalSalario = 20 * horastb;
  System.out.println("O salário no mês foi: R$ " + finalSalario);
  input.close();
}
}
