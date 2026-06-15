package sistemaAcademico;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String cpf,
                     String disciplina, double salario) {
        super(nome, idade, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
