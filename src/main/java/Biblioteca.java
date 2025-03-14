import java.time.LocalDate;
import java.util.*;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        if (livro != null && !livros.contains(livro)) {
            livros.add(livro);
            System.out.println("Livro adicionado: " + livro);
        } else {
            System.out.println("Livro inválido ou já existente.");
        }
    }

    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void registrarMembro(Membro membro) {
        if (membro != null && !membros.contains(membro)) {
            membros.add(membro);
            System.out.println("Membro registrado: " + membro);
        } else {
            System.out.println("Membro inválido ou já existente.");
        }
    }

    public Emprestimo registrarEmprestimo(Livro livro, Membro membro) {
        if (livros.contains(livro) && membros.contains(membro)) {
            Emprestimo emprestimo = new Emprestimo(livro, membro, LocalDate.now());
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: " + emprestimo);
            return emprestimo;
        } else {
            System.out.println("Livro ou membro não encontrado.");
            return null;
        }
    }

    public void devolverLivro(Emprestimo emprestimo) {
        if (emprestimo != null && emprestimos.remove(emprestimo)) {
            System.out.println("Livro devolvido: " + emprestimo);
        } else {
            System.out.println("Empréstimo não encontrado.");
        }
    }
}