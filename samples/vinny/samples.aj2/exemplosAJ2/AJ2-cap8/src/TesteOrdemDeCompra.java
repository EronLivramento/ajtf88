public class TesteOrdemDeCompra {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Antonio Pereira");
		OrdemDeCompra ordem = new OrdemDeCompra(cliente);
		
		//� possivel alterar os dados do cliente
		ordem.cliente.setNome("Marcos Pereira");
		
		//n�o � possivel atribuir um novo cliente ao pedido
		Cliente cliente2 = new Cliente("Ana Silva");
		ordem.cliente = cliente2;
	}
}
