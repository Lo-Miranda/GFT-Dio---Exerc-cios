import java.util.Random;

public class multiDimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] M = new int[4][4];

        //para cada linha da matriz:
        for(int i = 0; i < M.length; i++) {
            //j é cada coluna da matriz:
            for(int j = 0; j < M[i].length; j++) {
                //linha i, coluna j, recebe um número random:
                M[i][j] = random.nextInt(9);
            }
        }

        //Matriz:
        for (int[] linha : M) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");

            }
            System.out.println();
        }
    }
}
