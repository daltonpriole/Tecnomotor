package tabelas_tipo2;

import javax.swing.JFrame;

public class Aplicacao {

	public static void main(String[] args) {
		
		ViewTabelaTipos janela = new ViewTabelaTipos();
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300,300);
		janela.setVisible(true);

	}

}
