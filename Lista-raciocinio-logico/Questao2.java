//Construa um algoritmo que calcule e informe a quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro da gasolina. Para o calculo, sabe-se que o carro faz em média 12 Km/litro.
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double lGasolinaNecessaria;
  double distanciaPercorrida;
  double precoLitroG;
  double valorFinal;

  System.out.println("Qual a distância que você vai percorrer?");
  distanciaPercorrida = input.nextDouble();
  System.out.println("Quanto é o valor do litro de gasolina?");
  precoLitroG = input.nextDouble();
  lGasolinaNecessaria = distanciaPercorrida / 12;
  valorFinal = lGasolinaNecessaria * precoLitroG;

  System.out.printf("A quantidade de gasolina necessária é: %.2f\n", lGasolinaNecessaria);
  System.out.printf("Vai custar : R$%.2f\n", valorFinal);
  input.close();
}
}
