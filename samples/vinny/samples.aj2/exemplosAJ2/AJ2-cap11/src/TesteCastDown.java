public class TesteCastDown {

    public static void main(String[] args) {
        Cliente c = new Cliente();

        // Cast UP de Cliente para Pessoa
        Pessoa p = c;

        // Cast DOWN de Pessoa para Cliente
        Cliente c2 = (Cliente) p;

        // Cria��o de uma inst�ncia da classe Pessoa
        Pessoa p2 = new Pessoa();

        // Cast DOWN INV�LIDO de Pessoa para Cliente
        Cliente c3 = (Cliente) p2;
    }
}
