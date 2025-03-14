import java.time.LocalDate;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro coisasPraFazer = new Livro("Livro A", "Autor A", "12345");
        Livro BoasManeiras = new Livro("Livro B", "Autor B", "67890");

        Membro joao = new Membro("Membro A", 1, "emailA@fiap.com.br");
        Membro pedro = new Membro("Membro B", 2, "emailB@fiap.com.br");

        biblioteca.adicionarLivro(coisasPraFazer);
        biblioteca.adicionarLivro(BoasManeiras);

        biblioteca.registrarMembro(joao);
        biblioteca.registrarMembro(pedro);

        Emprestimo emprestimo = biblioteca.registrarEmprestimo(coisasPraFazer, joao);
        biblioteca.devolverLivro(emprestimo);

        biblioteca.removerLivro(BoasManeiras);
    }
}


