import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroTabuada;
        System.out.println("De qual número deseja ver a tabuada? (de 1 a 10)");
        numeroTabuada = scan.nextInt();

        for (int i = 1; i<=10; i = i + 1) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

    }
}
