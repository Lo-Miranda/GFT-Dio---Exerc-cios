import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
       /*String[] letras = {"b", "f", "g", "k", "m", "r"};
        int i = 0;

        while (i < (letras.length)) {
            System.out.print(letras[i] + " ");
            i++;
        }
    }*/

        Scanner scan = new Scanner(System.in);
        String[] vetorLetras = new String[6];
        int quantidadeConsoantes = 0;
        int i = 0;

        do {
            System.out.println("Digite uma consoante: ");
            String letraDigitada = scan.next();

            //vai filtrar o que for vogal. Se vogais forem digitadas, vai aparecer como null no vetor:
            if (!(letraDigitada.equalsIgnoreCase("a") |
                    letraDigitada.equalsIgnoreCase("e") |
                    letraDigitada.equalsIgnoreCase("i") |
                    letraDigitada.equalsIgnoreCase("o") |
                    letraDigitada.equalsIgnoreCase("u"))) {


                vetorLetras[i] = letraDigitada;
                quantidadeConsoantes++;
            }

            i++;

        } while (i < vetorLetras.length);
            for (String elementoVetor : vetorLetras ) {

                //vai impedir que a palavra null apareça quando uma vogal for digitada:
                if(elementoVetor != null) {
                    System.out.print(elementoVetor + " ");
                }

            }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
