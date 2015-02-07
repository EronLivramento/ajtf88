public class MauDepartamento {

    private String nome;
    private Pessoa[] pessoas;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
    public Pessoa[] getPessoas() {
        return pessoas;
    }
    public void imprime() {
        System.out.println("----------------------------------");
        System.out.println("Departamento: " + this.getNome());
        // É preciso garantir que o array de pessoas tenha sido inicializado
        // e, por isso deve ser diferente de null. 
        if (pessoas != null) {
            for (int i = 0; i < pessoas.length; i++) {
                System.out.println(pessoas[i].getNome());
            }
        } else
            System.out.println("Nao ha pessoas neste departamento");
        System.out.println("----------------------------------");
    }
}
