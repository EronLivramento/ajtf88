package br.com.globalcode.testes;

import java.util.Comparator;
import br.com.globalcode.beans.Cliente;

public class ComparadorClientesQtdPedidos implements Comparator{
	public int compare(Object o1, Object o2) {
		Cliente cl1 = (Cliente) o1;
		Cliente cl2 = (Cliente) o2;
		return cl1.getQtdPedidos() - cl2.getQtdPedidos();
	}
}
