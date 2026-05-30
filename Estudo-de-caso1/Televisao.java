/*2)Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo:
Uma televisão possui as seguintes características:
tamanho de tela (em polegadas);
volume: de 1 a 10 iniciando em 5 (somente no construtor);
marca;
voltagem (220 e 110);
canal.
A televisão pode realizar as seguintes ações:
ligar: ao ligar a televisão deve imprimir seu consumo. O
consumo deve ser definido pela voltagem multiplicada pela
quantidades de polegadas;
desligar;
aumentar e diminuir o volume;
subir e descer canal.


*/

import java.util.Scanner;

public class Televisao {
	public static void main(String[] args) {
    int tamanhoPolegadas;
    int volume = 5;
    String marca;
    int voltagem;
    int canal;
    dooble ligado = false;
    float consumo;

    public Televisao(int tamanhoPolegadasTv, int volumeTv, String marcaTv, int voltagemTv, int canalTv, dooble ligadoTv, float consumoTv){
    this.tamanhoPolegadas = tamanhoPolegadasTv;
    this.volume = volumeTv;
    this.marca = marcaTv;
    this.voltagem = voltagemTv;
    this.canal = canalTv;
    this.ligado = ligadoTv;
    this.consumo = consumoTv;
      
    }

    public desligarTv(){
      dooble ligadoTv = false;
      System.out.println("Desligando televisão...");
    }

    public ligarTv(){
      consumoTv = voltagemTv * quantidadePolegadasTv;
      dooble ligadoTv = true;
      System.out.println("\nLigando televisão...");
      System.out.printf("O consumo da televisão é: %.2f", consumoTv);
      
    }

    public subirCanal(){
      canalTv++;
        if(canalTv > 100){
        canalTv = 100;
        }
    }

    public descerCanal(){
      canalTv--;
        if(canalTv < 1){
        canalTv = 1;
        }
    }

    public aumentarVolume(){
      volumeTv++;
        if(volumeTv > 10){
        volumeTv = 10;
        }
    }

    public diminuirVolume(){
      volumeTv--;
        if(volumeTv < 1){
        volumeTv = 1;
        }
    }

close.Scanner();

    
	}
}


