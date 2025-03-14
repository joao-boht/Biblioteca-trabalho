public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;

    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String CoisasPraFazer() { return titulo; }
    public String joao() { return autor; }
    public String ISBN() { return ISBN; }

    @Override
    public String toString() {
        return "coisasPraFazer{" +
                "o tal='" + titulo + '\'' +
                ", joao='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
