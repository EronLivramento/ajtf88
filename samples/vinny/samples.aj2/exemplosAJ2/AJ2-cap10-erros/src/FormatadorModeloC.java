

public class FormatadorModeloC extends FormatadorRecibo {
    
	//A ordem dos par�metro nomeCliente e valor est� invertida
    public String gerarRecibo(double valor, String nomeCliente, 
                              String data, String motivo) {
        
        return "N�s da " + super.getNomeEmpresa() + 
               " recebemos de " + nomeCliente + 
               " em " + data + 
               " o valor de R$ " + valor +
               " referente a " + motivo;
    }     
}
