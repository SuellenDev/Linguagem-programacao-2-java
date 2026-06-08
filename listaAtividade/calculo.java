public class Main {

  public static void main(String[] args) {
      Calculo calculo = new Calculo();
      calculo.calculoSalario(58, 20);
      
      System.out.println("O salário final é: R$ " + calculo.getTotalSalario());
    }
}
class Calculo {
    private double totalSalario;

    public void calculoSalario(double salario, int horasTrabalhadas) {
        totalSalario = salario * horasTrabalhadas;
      
    }
    public double getTotalSalario() {
        return totalSalario;
    }
}
