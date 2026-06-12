package sistemaAcademico;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        setIdade(idade); //sem set não faz validação
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
