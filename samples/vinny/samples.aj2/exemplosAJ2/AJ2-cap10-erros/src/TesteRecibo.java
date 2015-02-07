public class TesteRecibo {
    public static void main(String[] args) {
        FormatadorRecibo fr = new FormatadorRecibo();
        fr.setNomeEmpresa("Rain microsystems do Brasil");
        String texto = fr.gerarRecibo("William Gates", 2000.0, "11/04/2004", 
                                      "Aluguel de Servidores");
    }
}
