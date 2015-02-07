public class Curso {

	private String nome;
    private String descricao;
    private String codigo;
    private int cargaHoraria;

    public Curso(String nome, String descricao, String codigo, int cargaHoraria) {
        setNome(nome);
        setDescricao(descricao);
        setCodigo(codigo);
        setCargaHoraria(cargaHoraria);
    }

    public Curso(String nome, String cod, int cargaHoraria) {
        this.setNome(nome);
        this.setCodigo(cod);
        this.setCargaHoraria(cargaHoraria);
    }

    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Carga Horaria: " + this.getCargaHoraria());
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
