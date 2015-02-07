public class TesteCastUp {

    public static void main(String[] args) {

        // O objeto c foi declarado e instanciado como Cliente
        Cliente c = new Cliente();

        // Casting UP explicito do objeto da classe Cliente para classe Pessoa
        Pessoa p = (Pessoa) c;

        // Casting UP do objeto da classe Cliente para classe Pessoa
        Pessoa p2 = c;

        // Casting UP do objeto da classe Cliente para Pessoa
        Pessoa p3 = new Cliente();

        // Casting UP explícito do objeto da classe Cliente para classe Object
        Object o = (Object) c;

        // Casting UP do objeto da classe Cliente para classe Object
        Object o2 = c;
    }
}