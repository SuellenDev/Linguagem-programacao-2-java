/*1) Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo.
Um carro possui as seguintes características:
modelo;
velocidade;
aceleração;
marcha.
O carro pode realizar as seguintes ações:
ligar e desligar;
acelerar e desacelerar;
virar a direita e esquerda;
marcha para cima e para baixo */

import java.util.Scanner;
public class Carro {
public static void main(String [] args){
  //atributos
  Scanner input = new Scanner (System.in);
  String modelo;
  double velocidade;
  double aceleracao;
  int marcha;
  boolean ligado = false;
  
//construtor
  public Carro (String modeloCarro, double velocidadeCarro, double aceleracaoCarro, int marchaCarro, boolean ligadoCarro) {
    this.modelo = modeloCarro;
    this.velocidade = velocidadeCarro;
    this.aceleracao = aceleracaoCarro;
    this.marcha = marchaCarro;
    this.ligado = ligadoCarro;
    
  }
  //comportamentos
  public void ligarCarro(){
    ligado = true;
    System.out.println("O carro ligado.");
  }

  public void desligarCarro(){
    ligado = false;
    System.out.println("O carro desligado.");
  }

  public void acelerarCarro(){
    aceleracao++;
    System.out.println("Acelerando.");
  }
  
    public void desalerarCarro(){
    aceleracao--;
    System.out.println("Desacelerando.");
  }
  
    public void virarDireita(){
      System.out.println("Virando a direita.");
    }

    public void virarEsquerda(){
      System.out.println("Virando a esquerda.");
    }

    public void marchaParaCima(){
      marcha++;
      if (marchaCarro > 5){
        marcha = 5;
      }
      System.out.printf("Marcha para cima, %dº marcha.", marchaCarro);
    } 

    public void marchaParaBaixo(){
      marcha--;
      if (marchaCarro < 1){
        marcha = 1;
      }
      System.out.printf("Marcha para baixo, %dº marcha.", marchaCarro);
    } 
  
  input.close();
}
}
