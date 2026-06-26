public class FuncionarioHora extends Funcionario {

    private int horasTrabalhadas;
    private double valorHora;

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
