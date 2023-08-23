package Mensagens.main;

import Mensagens.apps.FacebookMessenger;
import Mensagens.apps.MSNMessenger;
import Mensagens.apps.ServicoMensagem;
import Mensagens.apps.Telegram;

public class Computador {

    public static void main(String[] args) {

        ServicoMensagem smi = null;

        String appEscolhido = "face";

        switch (appEscolhido) {
            case "msn" -> smi = new MSNMessenger();
            case "face" -> smi = new FacebookMessenger();
            case "tlg" -> smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
