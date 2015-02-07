public class TesteInterface {

	  public static void main(String[] args) {
	        
	    Mobilia mob = new Mobilia("mesa", "Moveis Silva", "madeira/formica/metal",
	                               115, 70, 90, 11);
	    System.out.println("Mobilia: " + mob.getTipo());
	    System.out.println("volume: " + mob.getVolume() 
	    		+ Transportavel.UNIDADE_VOLUME);
	    System.out.println("peso: " + mob.getPeso() + Transportavel.UNIDADE_PESO);
	    System.out.println("empilhamento max: " + mob.getEmpilhamentoMaximo());
	    System.out.println();
	        
	    Alimento junk = new Alimento("hamburguer", -2, 350, 260d, 6, 30);
	    System.out.println("Alimento: " + junk.getNome());
	    System.out.println("volume: " + junk.getVolume() 
	    		+ Transportavel.UNIDADE_VOLUME);
	    System.out.println("peso: " + junk.getPeso() + Transportavel.UNIDADE_PESO);
	    System.out.println("empilhamento max: " + junk.getEmpilhamentoMaximo());
	    System.out.println("conservacao: " + junk.getTemperaturaDeConservacao() 
	    		+ "C");
	    System.out.println("dias de validade: " + junk.getDiasDeValidade());
	        
	  }
	}
