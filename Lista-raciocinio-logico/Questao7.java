//Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o usuário está obeso. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double peso;
  double altura;
  double imc;

  System.out.println("Informe a sua altura:");
  altura = input.nextDouble();
  System.out.println("Informe o seu peso:");
  peso = input.nextDouble();

  imc = peso / (altura * altura);

  if (imc > 30){
    System.out.println("\nVocê está acima do peso.(OBESIDADE)");
  } else{
    if (imc == 30 || imc >= 19 ){
      System.out.println("\nVocê está com o peso normal.");
    } else {
      System.out.println("\nVocê está abaixo do peso.");
    }
  }
  
  input.close();
}
}
