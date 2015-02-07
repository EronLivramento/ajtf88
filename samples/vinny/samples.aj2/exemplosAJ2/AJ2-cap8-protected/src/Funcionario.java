public class Funcionario extends Pessoa {

    private long carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public void setCarteiraProfissional(long carteira) {
        this.carteiraProfissional = carteira;
    }
    public long getCarteiraProfissional() {
        return carteiraProfissional;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void impressaoRecibo(int dia, int mes, int ano) {
        System.out.println("\n\n------- Recibo pagamento ------");
        System.out.print(" Eu, " + nome + ", portador do RG de numero: ");
        System.out.print(rg + " declaro que recebi o valor de R$ " + salario);
        System.out.print(" referente ao meu pagamento no dia "
                + dia + "/" + mes + "/" + ano);
        System.out.println("\n-----------------------------------\n\n");
    }
}
