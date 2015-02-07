public class Curso {

    private String nome;
    private String descricao;
    private String codigo;
    private int cargaHoraria;

    public void inicializaCurso(String nome, String desc, String cod, int carga) {
        setNome(nome);
        setCodigo(cod);
        setCargaHoraria(carga);
        setDescricao(desc);
    }
    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Carga Horaria: " + this.getCargaHoraria());
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getCodigo() {
        return codigo;
    }
 

    public String getDescricao() {
        return descricao;
    }
    public String getNome() {
        return nome;
    }
    public void setCargaHoraria(int i) {
        cargaHoraria = i;
    }
    public void setCodigo(String cod) {
        codigo = cod;
    }
    public void setDescricao(String desc) {
        this.descricao = desc;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
