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

    int tamanhoPolegadas;
    int volume = 5;
    String marca;
    int voltagem;
    int canal;
    boolean ligado = false;
    float consumo;

    public Televisao(int tamanhoPolegadasTv, int volumeTv, String marcaTv,
                     int voltagemTv, int canalTv, boolean ligadoTv,
                     float consumoTv) {

        this.tamanhoPolegadas = tamanhoPolegadasTv;
        this.volume = volumeTv;
        this.marca = marcaTv;
        this.voltagem = voltagemTv;
        this.canal = canalTv;
        this.ligado = ligadoTv;
        this.consumo = consumoTv;
    }

    public void desligarTv() {
        ligado = false;
        System.out.println("Desligando televisão...");
    }

    public void ligarTv() {
        consumo = voltagem * tamanhoPolegadas;
        ligado = true;
        System.out.println("\nLigando televisão...");
        System.out.printf("O consumo da televisão é: %.2f%n", consumo);
    }

    public void subirCanal() {
        canal++;
        if (canal > 100) {
            canal = 100;
        }
    }

    public void descerCanal() {
        canal--;
        if (canal < 1) {
            canal = 1;
        }
    }

    public void aumentarVolume() {
        volume++;
        if (volume > 10) {
            volume = 10;
        }
    }

    public void diminuirVolume() {
        volume--;
        if (volume < 1) {
            volume = 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Televisao tv = new Televisao(50, 5, "Samsung", 220, 1, false, 0);

        input.close();
    }
}
