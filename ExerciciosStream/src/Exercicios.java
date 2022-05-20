import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicios {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("20", "3", "8", "100", "6");

        //Imprima todos os elementos dessa lista de String:
        System.out.println("Lista completa: ");
        numerosAleatorios.forEach(System.out::println); //method reference
        System.out.println();

        //pegue os 3 primeiros números e coloque dentro de um Set:
        System.out.println("Três primeiros elementos: ");
        numerosAleatorios.stream()
                .limit(3)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println();

        //Transforme essa lista de Strings em Inteiros:
        System.out.println("Transformados em inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatorios);
        System.out.println();

        //Pegue os números pares e maiores que 2 e coloque em uma lista:
        System.out.println("Números pares maiores que 2: ");
        List<Integer> ListParesMaioresQ2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQ2);
        System.out.println();

        //Mostre a média dos números:
        System.out.println("Média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        Set<String> coresDaBandeiraDoBrasil = Collections.unmodifiableSortedSet(new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco")));
        System.out.println(coresDaBandeiraDoBrasil);

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);

    }
}
