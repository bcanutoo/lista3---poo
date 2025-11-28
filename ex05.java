interface Mensagem {
    void enviar(String texto);
}

class Email implements Mensagem {
    public void enviar(String texto) {
        System.out.println("Enviando e-mail: " + texto + " !!");
    }
}

class PrincipalMsg {
    public static void main(String[] args) {
        Mensagem m = new Email();
        m.enviar("Olá, teste de mensagem");
    }
}
