package br.com.globalcode.exceptions;

public class GlobalcodeException extends Exception {

    public GlobalcodeException(String mensagem, Exception e) {
        super(mensagem, e);
        e.printStackTrace();
        this.print();
        //  Envia e-mail para o responsável
    }
    public GlobalcodeException(String mensagem) {
        super(mensagem);
        //  Envia e-mail para o responsável
    }

    public void print() {
        System.out.println("============== Tratando Erro ===============");
        System.out.println(getMessage());
        System.out.println("PrintStackTrace: ");

        // Obtivemos a exceção causadora do problema passada como parametro
        // no construtor
        printStackTrace();
        System.out.println("============ Fim do Tratamento =============");
    }
}