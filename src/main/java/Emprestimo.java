import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, Membro membro, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro Livro() { return livro; }
    public Membro Membro() { return membro; }
    public LocalDate DataEmprestimo() { return dataEmprestimo; }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", membro=" + membro +
                ", dataEmprestimo=" + dataEmprestimo +
                '}';
    }
}
