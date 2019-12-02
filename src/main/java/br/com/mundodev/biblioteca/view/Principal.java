package br.com.mundodev.biblioteca.view;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import br.com.mundodev.biblioteca.view.pessoa.CadastroPessoa;

public class Principal extends JFrame {

	private static final long serialVersionUID = -2462449190621087537L;
	
	public Principal() {
		
		setTitle("Biblioteca");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		final var menuBar = new JMenuBar();
		
		final var pessoaMenu = new JMenu("Pessoa");
		
		final var pessoaCadastrar = new JMenuItem("Cadastrar pessoa");
		final var pessoaEditar = new JMenuItem("Editar pessoa");
		pessoaMenu.add(pessoaCadastrar);
		pessoaMenu.add(pessoaEditar);
		
		menuBar.add(pessoaMenu);
		
		setJMenuBar(menuBar);
		
		pessoaCadastrar.addActionListener((ActionEvent event) -> {
			changePanel(new CadastroPessoa());
		});		
		
	}
	
	private void changePanel(JPanel panel) {
		getContentPane().removeAll();
		getContentPane().add(panel);
		revalidate();
		repaint();
	}	

}
