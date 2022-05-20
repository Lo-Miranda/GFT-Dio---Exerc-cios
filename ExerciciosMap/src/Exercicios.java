import java.io.PrintStream;
import java.util.*;

public class Exercicios {
    public static void main(String[] args) {
        //crie um dicionário que relacione modelos de carros e seus consumos:
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4); //put é o equivalente ao add
            put("Uno", 16.4);
            put("Mobi", 18.4);
            put("Hb20", 11.4);
        }};
        System.out.println(carrosPopulares);
        System.out.println();

        //substitua o consumo do gol por 15,2:
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println();

        //confira se o modelo Tucson está no dicionário:
        System.out.println("Tucson está na lista? " + carrosPopulares.containsKey("Tucson"));
        System.out.println();

        //Exiba o consumo do Uno:
        System.out.println("Consumo do Uno: " + carrosPopulares.get("Uno"));
        System.out.println();

        //Exiba os modelos:
        carrosPopulares.keySet(); //retorna um Set. O resultado não vai aparecer a menos que seja posto dentro de uma var Set.

        //Exiba o consumo mais eficiente:
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = " "; //variável de controle

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + "-" + consumoMaisEficiente);
        System.out.println();

        //Exiba o modelo menos econômmico e seu consumo:
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = " ";//var de controle

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + "-" + consumoMenosEficiente);
            }

        }
        System.out.println();

        //Exiba a soma dos consumos:
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos: " + soma);
        System.out.println();

        //Média dos consumos:
        System.out.println("Média dos consumos: " + soma/carrosPopulares.size());
        System.out.println();

        //remova os modelos com consumo igual a 11.4:
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(11.4)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println();

        //exiba os carros na ordem em que foram informados:
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("Gol", 14.4); //put é o equivalente ao add
            put("Mobi", 18.4);
            put("Uno", 16.4);
            put("Hb20", 11.4);
            put("Bla", 18.4);
        }};
        System.out.println(carrosPopulares1);
        System.out.println();

        //exiba o dicionário ordenado pelo modelo:
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println();

        //apague o dicionário de carros:
        carrosPopulares.clear();

        //confira se o dicionário está vazio:
        System.out.println("Está vazio? " + carrosPopulares.isEmpty());
        System.out.println();

        //colocar em ordem aleatória o nome do autor e nome do livro:
        System.out.println("Ordem aleatória: ");
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Neil Gaiman", new Livros("Colarine", 150));
            put("Yuval Harari", new Livros("Sapiens", 380));
            put("Bram Stoker", new Livros("Dracula", 300));
        }};
        for(Map.Entry<String, Livros> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());

        System.out.println();

        //colocar em ordem de inserção:
        System.out.println("Ordem de inserção: ");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Neil Gaiman", new Livros("Colarine", 150));
            put("Yuval Harari", new Livros("Sapiens", 380));
            put("Bram Stoker", new Livros("Dracula", 300));
        }};
        for(Map.Entry<String, Livros> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        System.out.println();

        //Ordem alfabética por autores:
        System.out.println("Ordem alfabética por autores");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livros> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + "-" +livro.getValue().getNome());
        }
        System.out.println(meusLivros2);




    }
}
