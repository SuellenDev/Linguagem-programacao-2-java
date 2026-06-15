public class Calculadora {
    private double valorBase;

    public Calculadora() {
        this.valorBase = 0.0;
    }

    public Calculadora(double valorBase) {
        this.valorBase = valorBase;
    }

    public double calculo(double numero) {
        return this.valorBase + numero;
    }

    public double calculo(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double calculo(double numero1, double numero2, double numero3) {
        return numero1 * numero2 * numero3;
    }

    public double calculo(int numero) {
        return this.valorBase / numero;
    }
}
