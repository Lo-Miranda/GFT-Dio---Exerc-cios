public class ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {9, 15, 48, 2, 77, -11};
        int i = 0;

        // O '-1' aqui serve para compensar o número a mais, criado por causa da posição 0 do vetor:
        for(i = (vetor.length -1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
}
