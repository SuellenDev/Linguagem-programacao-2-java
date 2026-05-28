// Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados, tais como valor da hora aula, número de horas trabalhadas no mês, percentual de desconto do INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor do salário líquido. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double salarioLiquidoProfessor;
  double valorHoraAula;
  double horasTrabalho;
  double descontoINSSPorcentagem = 0.14;

  System.out.println("Qual valor da sua hora de trabalho no mês?");
  valorHoraAula = input.nextDouble();
  System.out.println("\nQuantas horas você trabalhou esse mês?");
  horasTrabalho = input.nextDouble();

  salarioLiquidoProfessor = (valorHoraAula * horasTrabalho) / descontoINSSPorcentagem;
  
  System.out.printf("\nO salário líquido de professor é: %.2f", salarioLiquidoProfessor);
  
  input.close();
}
}
