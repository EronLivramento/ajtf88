public class TesteFuncionario {

    public static void main(String[] args) {

        // Criando o endereco para o funcion�rio f
        Endereco end1 = new Endereco("Rua das tulipas", 1200);

        // Criando o funcion�rio f
        Funcionario f = new Funcionario();

        //  atribuindo as caracter�sticas herdadas da classe Pessoa
        f.setNome("Pedro da Silva");
        f.setEndereco(end1);
        f.setRg("1234545");

        //  atribuindo as caracter�sticas espec�ficas de funcion�rios
        f.setSalario(10000);
        f.setCarteiraProfissional(123434L);
        f.impressaoRecibo(16,4,2005);
    }
}
