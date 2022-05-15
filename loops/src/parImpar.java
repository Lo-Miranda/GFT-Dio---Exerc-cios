import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //quantidade de pedidos:
        int vezesNumeros;
        System.out.println("Digite a quantidade de pedidos: ");
        vezesNumeros = scan.nextInt();
        int i = 0;

        //números a serem digitados:
        int numero;

        //pares e ímpares:
        int pares = 0;
        int impares = 0;


        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                pares = pares +1;
            } else {
                impares = impares + 1;
            }

            i = i + 1;
        } while (i < vezesNumeros);

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
