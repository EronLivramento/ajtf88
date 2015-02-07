package br.com.globalcode.aj4.eventos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @course AJ4
 * @chapter 01
 * @page 044
 * @sample 01.18
 */
public class TesteEventosJComboBox extends JFrame {

	private JComboBox seletorBancos = new JComboBox();
	private JTextField tfBanco = new JTextField();

	public TesteEventosJComboBox() {
		super("Teste Eventos JComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));

		seletorBancos.addItem("Itau");
		seletorBancos.addItem("Bradesco");
		seletorBancos.addItem("Globalcode Bank");
		seletorBancos.addActionListener(new SeletorBancosHandler());

		add(seletorBancos);
		add(tfBanco);
		setSize(275,100);
		setVisible(true);
	}

	class SeletorBancosHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Item selecionado: "+ seletorBancos.getSelectedItem());
			tfBanco.setText(seletorBancos.getSelectedItem().toString());
		}

	}

	public static void main(String[] args) {
		TesteEventosJComboBox t = new TesteEventosJComboBox();
	}
}
