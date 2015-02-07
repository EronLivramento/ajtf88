package br.com.globalcode.aj4.awt;

import java.awt.Frame;

/**
 * @course AJ4
 * @chapter 01
 * @page 009
 * @sample 01.01
 */
public class ExemploFrame extends Frame {

	public ExemploFrame(String title){
		setTitle(title);
		setSize(200,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		ExemploFrame janela = new ExemploFrame("Titulo da Janela");
	}
}
