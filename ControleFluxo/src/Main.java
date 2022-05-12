public class Main {
    public static void main(String[] args) {

        ferias();
        feriasSwitch();
        mesAno();
        diaSemana();
        decisaoVariavel();
    }



    public static void ferias (){
        System.out.println("------É mês de férias?-------");
        int mes = 7;

        if (mes == 1 || mes == 7 || mes==12) {
            System.out.println("Férias!");
        } else {
            System.out.println("Vá trabalhar :(");
        }
    }

    public static void feriasSwitch () {
        System.out.println("------É mês de férias?-------");
        int mes = 12;

        switch (mes) {
            case 1:
                System.out.println("É janeiro. Estamos em férias!");
                break;
            case 7:
                System.out.println("É julho. Estamos em férias!");
                break;
            case 12:
                System.out.println("É dezembro. Estamos em férias!");
                break;
            default:
                System.out.println("Não é mês de férias. Vá trabalhar!");

        }

    }

    public static void mesAno() {
        System.out.println("------Qual é o mês do ano?-------");
        int mes = 2;

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
    }

    public static void diaSemana() {
        System.out.println("------Número do dia da semana?-------");
        String dia = "domingo";

        switch (dia) {
            case "domingo":
                System.out.println("1");
                break;
            case "segunda":
                System.out.println("2");
                break;
            case "terça":
                System.out.println("3");
                break;
            case "quarta":
                System.out.println("4");
                break;
            case "quinta":
                System.out.println("5");
                break;
            case "sexta":
                System.out.println("6");
                break;
            case "sábado":
                System.out.println("7");
                break;
            default:
                System.out.println("Valor inválido");

        }
    }

    public static void decisaoVariavel() {
        System.out.println("------Número certo, errado ou talvez?-------");
        int valor = 7;

        switch (valor) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado.");
                break;
            case 5:
                System.out.println("Talvez.");
                break;
            default:
                System.out.println("Valor indefinido.");
        }
    }
}


