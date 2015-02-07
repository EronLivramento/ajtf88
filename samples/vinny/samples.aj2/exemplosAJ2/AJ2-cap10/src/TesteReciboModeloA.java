

public class TesteReciboModeloA {

    public static void main(String[] args) {
        
        FormatadorModeloA fA = new FormatadorModeloA();
        fA.setNomeEmpresa("Rain microsystems do Brasil");
        String texto = fA.gerarRecibo("William Gates", 2000, "11/04/2004", 
                                      "Aluguel de Servidores");
        System.out.println(texto);
    }
}
