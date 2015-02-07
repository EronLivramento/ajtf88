public class TesteCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Academia Java","AJ",128);
		System.out.println("O curso " + curso1.getNome()
				+ " tem a carga horaria de " + curso1.getCargaHoraria()
				+ " horas");
		Curso curso2 = new Curso("Academia Web","AW", 124);
		System.out.println("O curso " + curso2.getNome()
				+ " tem a carga horaria de " + curso2.getCargaHoraria()
				+ " horas");
	}
}
