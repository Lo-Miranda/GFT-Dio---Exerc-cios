import java.util.Random;


public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleatorios = new int[20];
        int i = 0;

        //Cada nuneroRandom vai ser guardado dentro de numerosAleatorios:
        for (i = 0; i < numerosAleatorios.length; i++) {
            int numeroRandom = random.nextInt(100);
            numerosAleatorios[i] = numeroRandom;
        }

        //vai imprimir cada elemento dentro de numerosAleatorios:
        System.out.println("Números aleatórios gerados via Random: ");
        for (int elemento : numerosAleatorios ) {

            System.out.print(elemento + " ");


        }


        //vai imprimir os sucessores de cada elemento dentro de numerosAleatorios:
        System.out.println();
        System.out.println("Sucessores dos números aleatórios gerados via Random: ");
        for (int elemento : numerosAleatorios ) {

            System.out.print((elemento + 1) + " ");

        }
    }
}
