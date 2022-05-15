import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scan.nextInt();

        while (nota < 0 | nota> 10) {
            System.out.println("Valor inválido. Digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Você digitou a nota " + nota);
    }
}
