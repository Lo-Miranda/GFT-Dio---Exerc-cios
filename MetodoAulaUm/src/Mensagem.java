
public class Mensagem {
    public static void horaMensagem (int hora){

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                horaBomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                horaBoaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                horaBoaNoite();
                break;

            default:
                System.out.println("Hora inválida. Digite hora entre 5 e 24.");
                break;

        }
    }

    public static void horaBomDia(){
        System.out.println("Bom dia!");
    }

    public static void horaBoaTarde(){
        System.out.println("Boa tarde!");
    }

    public static void horaBoaNoite(){
        System.out.println("Boa noite!");
    }


}
