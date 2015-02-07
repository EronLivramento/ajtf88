

public class FormatadorModeloC extends FormatadorRecibo {
    
	//A ordem dos parâmetro nomeCliente e valor está invertida
    public String gerarRecibo(double valor, String nomeCliente, 
                              String data, String motivo) {
        
        return "Nós da " + super.getNomeEmpresa() + 
               " recebemos de " + nomeCliente + 
               " em " + data + 
               " o valor de R$ " + valor +
               " referente a " + motivo;
    }     
}
