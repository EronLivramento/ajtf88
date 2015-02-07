public class ExemploConstrutorIncorreto {
	public static void main(String[] args) {
		String nomeCurso = "Curso de tricot";
		String descricaoCurso = "Neste curso voce ira aprender tudo sobre tricot";
		String codigo = "ct1";
		int cargaHoraria = 40;
		// A ordem correta é (String, String ,String, int) representando
		// respectivamente nomeCurso, descricao, codigo, cargaHoraria
		Curso curso2 = new Curso(cargaHoraria, nomeCurso, descricaoCurso,codigo);
	}
}
