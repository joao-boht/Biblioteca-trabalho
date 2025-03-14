public class Membro {
    private String nome;
    private int id;
    private String email;

    public Membro(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public String Nome() { return nome; }
    public int Id() { return id; }
    public String Email() { return email; }

    @Override
    public String toString() {
        return "Membro{" +
                "joao='" + nome + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
