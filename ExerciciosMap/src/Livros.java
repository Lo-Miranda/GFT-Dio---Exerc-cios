import java.util.Objects;

public class Livros {
    private String nome;
    private Integer páginas;

    public Livros(String nome, Integer páginas) {

        this.nome = nome;
        this.páginas = páginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPáginas() {
        return páginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return Objects.equals(nome, livros.nome) && Objects.equals(páginas, livros.páginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, páginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", páginas=" + páginas +
                '}';
    }
}
