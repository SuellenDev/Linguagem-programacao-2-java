package sistemaBiblioteca;

public class SistemaBiblioteca {

    public static void main(String[] args) {

        // Criando um autor
        Autor autor = new Autor("Machado de Assis", "21/06/1839", "Um dos maiores escritores brasileiros.");

        // Criando um livro
        Livro livro = new Livro("Dom Casmurro", autor, "1899", "Romance da literatura brasileira.", "L001", "Disponível" );

        // Criando um exemplar
        Exemplar exemplar = new Exemplar("Literatura", "Romance","869.93");

        // Criando um funcionário
        Funcionario funcionario = new Funcionario("Maria Silva", "123.456.789-00", "15/03/1990");

        // Registrando empréstimo
        Emprestimo emprestimo = new Emprestimo(livro,"10/06/2026","EMP001");

        // Exibindo as informações
        System.out.println("Sistema Biblioteca");

        System.out.println("\nLivro:");
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor.nome);
        System.out.println("Data de Publicação: " + livro.dataPublicacao);
        System.out.println("Status: " + livro.status);

        System.out.println("\nExemplar:");
        System.out.println("Categoria: " + exemplar.categoria);
        System.out.println("Gênero: " + exemplar.genero);
        System.out.println("CDD: " + exemplar.cdd);

        System.out.println("\nFuncionário:");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("CPF: " + funcionario.cpf);

        System.out.println("\nEmpréstimo:");
        System.out.println("Código: " + emprestimo.codigoEmprestimo);
        System.out.println("Data: " + emprestimo.dataEmprestimo);
    }
}
