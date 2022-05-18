import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Adao", 24, "tigrado"));
            add(new Gato("Milka", 12, "preto"));
            add(new Gato("Abel", 07, "branco e cinza"));
        }};
        System.out.println("***Ordem de inserção: ***");
        System.out.println(meusGatos);
        System.out.println();

        System.out.println("***Ordem aleatória: ***");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println();

        System.out.println("***Ordem natural: ***");
        //lists organizam de acordo com a ordem de inserção
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println();

        System.out.println("***Ordem de idade: ***");
        // outra forma de fazer: Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println();

        System.out.println("***Ordem alfabética de cor: ***");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println();

        System.out.println("***Ordem de Nome, Cor e Idade ***");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

//criou a classe no mesmo doc para facilitar:
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) {
            return cor;
        } else {
            return Integer.compare((g1.getIdade()), g2.getIdade());
        }


        
    }
}
