//Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma circunferência e apresente a medida da área calculada. Sabe-se que para realizar o cálculo da área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r² . O valor do Raio será informado pelo usuário. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double area;
  double pi = 3.14;
  double raio;

  System.out.println("Qual é a medida do raio?");
  raio = input.nextDouble();

  area = pi * (raio * raio);

  System.out.printf("O valor da área é aproximadamente: %.2f", area);
  
  input.close();
}
}
