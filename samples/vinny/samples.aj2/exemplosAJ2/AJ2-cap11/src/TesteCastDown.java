public class TesteCastDown {

    public static void main(String[] args) {
        Cliente c = new Cliente();

        // Cast UP de Cliente para Pessoa
        Pessoa p = c;

        // Cast DOWN de Pessoa para Cliente
        Cliente c2 = (Cliente) p;

        // Criação de uma instância da classe Pessoa
        Pessoa p2 = new Pessoa();

        // Cast DOWN INVÁLIDO de Pessoa para Cliente
        Cliente c3 = (Cliente) p2;
    }
}
