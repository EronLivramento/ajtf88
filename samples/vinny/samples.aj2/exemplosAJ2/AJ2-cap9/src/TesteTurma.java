

public class TesteTurma {
	public static void main(String[] args) {
		Turma t = new Turma("Academia do Java", Periodo.DIURNO_INTEGRAL);
		System.out.println("\t- Curso : " + t.getCurso());
		System.out.println("\t- Hora inicio:" + t.getPeriodo().getHoraInicio());
		System.out.println("\t- Hora termino:" 
				+ t.getPeriodo().getHoraTermino());
	}
}
