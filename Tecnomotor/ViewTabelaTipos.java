package tabelas_tipo2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import exemplo04.JanelaComBotoes;

public class ViewTabelaTipos extends JFrame {

	// referencias para os widgets na janela
	private JLabel lab1;
	private JLabel lab2;
	private JTextField jtfNomeTipo;
	private JTextField jtfIdTipo;
	private JTable jtbTipo;
	private JScrollPane barraRolagem;
	private JButton btnAdiciona;
	private JButton btnRemove;

	// referência ao tablemodel da tabela
	private TableModelTipo tableModelTipo;

	// construtor desta janela
	public ViewTabelaTipos() {
		
		super("completo");

		// definindo o layout manager da janela
		setLayout(new FlowLayout());

		// criando a JTable:
		// antes precisamos criar o tablemodel que a JTable irá usar
		this.tableModelTipo = new TableModelTipo();
		// agora passamos a referência deste tablemodel para criar a JTable:
		jtbTipo = new JTable(tableModelTipo);

		// painel com barra de rolagem, com a tabela dentro
		barraRolagem = new JScrollPane(jtbTipo);
		add(barraRolagem);

		// demais widgets da interface...

		lab1 = new JLabel("Nome:");
		add(lab1);

		jtfNomeTipo = new JTextField(20);
		add(jtfNomeTipo);

		lab2 = new JLabel("Id:");
		add(lab2);

		jtfIdTipo = new JTextField(10);
		add(jtfIdTipo);

		btnAdiciona = new JButton("Adiciona");
		add(btnAdiciona);

		btnRemove = new JButton("Remove");
		add(btnRemove);

		// definindo o evento do botão adicionar
		btnAdiciona.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				
				// pega o nome digitado na caixa
				String nome = jtfNomeTipo.getText();
				// pega a idade digitada na caixa
				int idade = Integer.parseInt(jtfIdTipo.getText());
				// cria um objeto pessoa, a partir desses dados
				Tipo p = new Tipo(nome, id);
				// coloca este objeto no tablemodel, usando o metodo apropriado
				tableModelTipo.addTipo(p);
				// lembre que este metodo, automaticamente, causa o redesenho da tabela
			}

		});

		// definindo o evento do botão remover
		btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				// verifica qual linha da tabela foi selecionada
				int linhaSelecionada = jtbTipo.getSelectedRow();
				// remove o objeto pessoa na posicao referente a linha,
				// la no tablemodel, usando o metodo apropriado
				tableModelTipo.removerTipo(linhaSelecionada);
			}

		});
	}
}








