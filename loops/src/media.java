import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) {
                maior = numero;
            }
            i = i + 1;
        } while (i < 5);

        System.out.println("O maior número da lista é " + maior);
        System.out.println("A média dos números é " + (soma/5));
    }
}
