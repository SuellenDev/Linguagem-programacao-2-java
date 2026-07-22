public abstract class Funcionario {
  private String nome;
  private String cpf;

  public Funcionario(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }
  public abstract double calcularPagamento();
}

  public class FuncionarioHorista extends Funcionario{
    public int horasTrabalhadas;
    public int valorHora;

     public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas, double valorHora) {
      super(nome, cpf);
      this.horasTrabalhadas = horasTrabalhadas;
      this.valorHora = valorHora;
    }
      @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}

  public class FuncionarioMensalista extends Funcionario{
    private double salarioFixo;
    
    public FuncionarioMensalista(String nome, String cpf, double salarioFixo) {
        super(nome, cpf);
      this.salarioFixo = salarioFixo;
    }
       @Override
    public double calcularPagamento() {
        return salarioFixo;
    }
}
