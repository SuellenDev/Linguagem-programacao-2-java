//Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a mensagem apropriada. 
import java.util.Scanner;

public class Main {
public static void main(String [] args){
  
  Scanner input = new Scanner (System.in);
  double temperatura;

  System.out.println("Qual a sua temperatura?");
  temperatura = input.nextDouble();

    if (temperatura>37){
      System.out.println("\nVocê está com febre.");
      System.out.printf("A sua temperatura é: %.2f", temperatura);
  }else{     
    if (temperatura<=35 && temperatura>=32){
        System.out.printf("\nSua temperatura está normal.");
        System.out.printf("\nA sua temperatura é: %.2f", temperatura);
    }else{     
          System.out.printf("\nVocê está com hipotermia.");
          System.out.printf("\nA sua temperatura é: %.2f", temperatura);
    }
      
  }
  
  input.close();
}
}
