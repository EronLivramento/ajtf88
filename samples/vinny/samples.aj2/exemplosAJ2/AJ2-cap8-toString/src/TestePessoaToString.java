

public class TestePessoaToString {

	public static void main(String[] args) {
        Endereco e = new Endereco("Av. Bernardino de Campos", 327);
        Pessoa p = new Pessoa(e, "Antonio Claudio", "1231321");
        // O método toString() será chamado automaticamente
        System.out.println(p);
        System.out.println();
        String texto = "Dados da pessoa : \n" + p;
        System.out.println(texto);
    }
}
