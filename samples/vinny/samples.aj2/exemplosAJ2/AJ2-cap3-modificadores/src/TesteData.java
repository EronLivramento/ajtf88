class TesteData {

    public static void main(String[] args) {
        Data d = new Data();
        d.dia = -20;
        d.mes = 23;
        d.ano = 9;
        d.imprime();
        String s = d.isAnoBissexto() ? " " : " nao ";
        System.out.println("O ano " + s + "e  bissexto ");
    }
}
