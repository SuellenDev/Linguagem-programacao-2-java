public class Funcionario {
  private int nome;
  private int CPF;

  public Funcionario(int nome, int CPF){
    this.nome = nome;
    this.CPF = CPF;
  }

  public class FuncionarioHorista extends Funcionario{
    public int horasTrabalhadas;
    public int valorHora;

    public FuncionarioHorista(int horasTrabalhadas, int valorHora){
      this.horasTrabalhadas = horasTrabalhadas;
      this.valorHora = valorHora;
    }
  }
  
  public void calcularPagamento(){
    
  }
}
