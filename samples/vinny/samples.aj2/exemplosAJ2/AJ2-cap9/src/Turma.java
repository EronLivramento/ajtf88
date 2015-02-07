

public class Turma {
	private String curso;
    private Periodo periodo;
    
    public Turma(String curso, Periodo periodo){
        this.setCurso(curso);
        this.setPeriodo(periodo);
    }
     
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public Periodo getPeriodo() { return periodo; }
    public void setPeriodo(Periodo periodo) { this.periodo = periodo;}
}
