
public class TesteCarro {

    public static void main(String[] args) {
        
        System.out.print("Velocidade maxima permitida: " );
        System.out.println(Carro.velocidadeMaximaPermitida);
        
        Carro c1 = new Carro("GM", "IBM9876", 50);
        Carro c2 = new Carro("Volks", "SUN3344", 42);
        
        c1.acelerar(16);
        c2.acelerar(30);
        
        System.out.print("Carro " + c1.getPlaca() +" ultrapassou o limite ? ");
        System.out.println(c1.ultrapassouLimite());
        System.out.print("Carro " + c2.getPlaca() +" ultrapassou o limite ? ");
        System.out.println(c2.ultrapassouLimite());
        
        Carro.velocidadeMaximaPermitida = 70;
        System.out.print("\nVelocidade maxima permitida: ");
        System.out.println(Carro.velocidadeMaximaPermitida);
        
        System.out.print("Carro " + c1.getPlaca() +" ultrapassou o limite ? ");
        System.out.println(c1.ultrapassouLimite());
        System.out.print("Carro " + c2.getPlaca() +" ultrapassou o limite ? ");
        System.out.println(c2.ultrapassouLimite());
    }
}
