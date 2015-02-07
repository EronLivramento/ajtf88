public class Carro {
    
    private String fabricante;
    private String placa;
    private int velocidade;
    private static int velocidadeMaximaPermitida = 60;

    public Carro(String fabricante, String placa, int velocidade) {
        this.fabricante = fabricante;
        this.placa = placa;
        this.velocidade = velocidade;
    }
    
    public static int getVelocidadeMaximaPermitida() {
        return velocidadeMaximaPermitida;
    }

    public static void setVelocidadeMaximaPermitida(int vmax) {
        velocidadeMaximaPermitida = vmax;
        if(this.velocidade > velocidadeMaximaPermitida) {
        	this.setVelocidade(velocidadeMaximaPermitida);
        }
    }

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

     // demais getters e setters omitidos
}
