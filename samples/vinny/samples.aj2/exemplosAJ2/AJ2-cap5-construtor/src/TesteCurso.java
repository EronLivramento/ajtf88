public class TesteCurso {
    public static void main(String[] args) {

      String nomeCurso = "Curso de tricot";
      String descricaoCurso = "Neste curso voce ira aprender tudo sobre tricot";
      String codigo = "ct1";
      int cargaHoraria = 40;
      //  Chamada ao construtor com parâmetros de inicialização da classe Curso
      Curso curso1 = new Curso(nomeCurso,descricaoCurso ,codigo, cargaHoraria);    
      curso1.imprime();
    }
  }
