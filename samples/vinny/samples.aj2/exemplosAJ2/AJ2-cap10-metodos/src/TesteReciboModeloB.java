

public class TesteReciboModeloB {
    public static void main(String[] args) {

        FormatadorModeloB fB = new FormatadorModeloB();
        fB.setNomeEmpresa("Coffe & Milk");
        fB.setSimboloMoeda("Euro$");
        String texto = fB.gerarRecibo("Serafim da Silva", 4, "16/09/2004", 
                                      "cafe com bolinhos");
        System.out.println(texto);
    }
}
