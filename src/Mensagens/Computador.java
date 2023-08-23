package Mensagens;

public class Computador {

    public static void main(String[] args) {

        // abrindo MSN messenger
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger face = new FacebookMessenger();
        System.out.println("FACEBOOK");
        face.enviarMensagem();
        face.receberMensagem();

        Telegram tlg = new Telegram();
        System.out.println("TELEGRAM");
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
