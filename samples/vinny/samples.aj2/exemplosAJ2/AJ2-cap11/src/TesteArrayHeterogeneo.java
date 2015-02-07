

public class TesteArrayHeterogeneo {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Willian Gates da Silva");
        p.setRg(181920212223L);
        
        Cliente c = new Cliente();
        c.setNome("Luiz Antonio Faria Lima");
        c.setRg(272829303132L);
        c.setCpf("6544566-54");
        
        Funcionario f = new Funcionario();
        f.setNome("Americo Vespucio da Gama");
        f.setRg(495051525354L);
        f.setSalario(2650.0);
        f.setCarteiraProfissional("86554877899");
        
        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = f; // Funcionario
        pessoas[1] = p; // Pessoa
        pessoas[2] = c; // Cliente
        
        RelatorioPessoas relatorio = new RelatorioPessoas();
        relatorio.imprimeArray(pessoas);
    }
}
