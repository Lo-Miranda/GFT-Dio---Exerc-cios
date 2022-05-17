import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exerciosEmplosLists {
    public static void main(String[] args) {

        //Criar e add():
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);notas.add(6.0);notas.add(5.0);notas.add(4.0);notas.add(3.0);notas.add(0.0);
        System.out.println(notas);

        //IndexOf - Posição:
        System.out.println("A posição da nota 5.0 é " + notas.indexOf(5d));

        //adicione a nota 8 na posição 4:
        notas.add(4, 8d);
        System.out.println(notas);

        //substitua a nota 5 pela 6:
        notas.set(notas.indexOf(5d), 6.0);//aqui vc coloca o "5d" indicando o objeto em si, não sua posição.
        System.out.println(notas);

        //condira se a nota 5 está na lista:
        System.out.println(notas.contains(5d));

        //exiba todas as notas na ordem em que foram informados:
        for (Double nota: notas) {
            System.out.println(nota);
        }

        //exiba a terceira nota adicionada:
        System.out.print("Exiba a terceira nota adicionada:");
        System.out.println(notas.get(2));

        //exiba a menor nota:
        System.out.println("Menor nota: " + Collections.min(notas));

        //maior nota:
        System.out.println("Maior nota: " + Collections.max(notas));

        //soma dos valores:
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas: " + soma);

        //média das notas - soma/quantidade:
        System.out.println("Média das notas: " + (soma/notas.size()));

        //remova a nota 0:
        notas.remove(0d);
        System.out.println(notas);

        //remova a nota na posição 0:
        notas.remove(0);
        System.out.println(notas);

        //remova as notas menores que 7:
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) {
                iterator1.remove();
            }

        }
        System.out.println(notas);

        //apague a lista:
        notas.clear();
        System.out.println(notas);

        //confira se a lista está vazia:
        System.out.println(notas.isEmpty());



    }
}
