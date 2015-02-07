public class Funcionario extends Pessoa {

    private long carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public void setCarteiraProfissional(long carteira) {
        this.carteiraProfissional = carteira;
    }

    public long getCarteiraProfissional() {
        return this.carteiraProfissional;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setDataAdmissao(String data) {
        this.dataAdmissao = data;
    }

    public String getDataAdmissao() {
        return this.dataAdmissao;
    }
}
