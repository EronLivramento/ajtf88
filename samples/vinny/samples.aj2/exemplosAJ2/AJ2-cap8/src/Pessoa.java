public class Pessoa {

    private Endereco endereco;
    private String nome, rg;

    public void setEndereco(Endereco end) {
        this.endereco = end;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRg() {
        return rg;
    }

    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("RG: " + this.getRg());
        System.out.print("Endereco: " + this.getEndereco().getRua());
        System.out.println(" , " + this.getEndereco().getNumero());
    }
}
