
public class Main {

    public static void main(String[] args) {

        //Operações - Exercício 1:
        System.out.println("________________________________");
        System.out.println("**** Operações: ****");
        Operacoes.soma(8, 9);
        Operacoes.subtracao(7, 4);
        Operacoes.divisao(18, 9);
        Operacoes.multiplicacao(5,2);
        System.out.println("________________________________");
        //Hora do Dia - Exercício 2
        System.out.println("**** Mensagem do Dia: ****");
        Mensagem.horaMensagem(10);
        Mensagem.horaMensagem(15);
        Mensagem.horaMensagem(24);
        System.out.println("________________________________");

        //Empréstimo - Exercício 3
        System.out.println("**** Parcelas de Empréstimo: ****");
        Emprestimo.calcular(500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
    }
}
