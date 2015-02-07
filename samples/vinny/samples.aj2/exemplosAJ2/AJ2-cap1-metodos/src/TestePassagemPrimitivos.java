class TestePassagemPrimitivos {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        CalculadoraMaluca calculadora = new CalculadoraMaluca();
        System.out.println("O valor de num1 antes do metodo multiplica:" + num1);
        System.out.println("O valor de num2 antes do metodo multiplica:" + num2);

        //o método multiplica atribui zero aos dois parâmetros recebidos
        calculadora.multiplicaValores(num1, num2);

        System.out.println("O valor de num1 apos o metodo:" + num1);
        System.out.println("O valor de num2 apos o metodo:" + num2);
    }
}
