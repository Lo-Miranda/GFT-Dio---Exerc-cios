import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        for (int i = numero; i >= 1; i--) {
            multiplicacao = multiplicacao * i;

        }
        System.out.println("O fatorial de " + numero + " é " + multiplicacao);
     }
}
