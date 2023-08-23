package Mensagens.apps;

import Mensagens.apps.ServicoMensagem;

public class Telegram extends ServicoMensagem {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
