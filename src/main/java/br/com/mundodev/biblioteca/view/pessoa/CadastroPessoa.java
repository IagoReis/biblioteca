package br.com.mundodev.biblioteca.view.pessoa;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.mundodev.biblioteca.config.BeanProvider;
import br.com.mundodev.biblioteca.model.Pessoa;
import br.com.mundodev.biblioteca.repository.PessoaRepository;

public class CadastroPessoa extends JPanel {
	
	private static final long serialVersionUID = 4306661372624836944L;
	
	private JTextField txtCpf;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public CadastroPessoa() {
		
		BeanProvider.autowire(this);
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF: ");
		lblNewLabel.setBounds(24, 31, 66, 15);
		add(lblNewLabel);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(132, 29, 240, 19);
		add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		lblNewLabel_1.setBounds(24, 58, 66, 15);
		add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(132, 60, 240, 19);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone: ");
		lblNewLabel_2.setBounds(24, 93, 90, 15);
		add(lblNewLabel_2);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(132, 91, 240, 19);
		add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail: ");
		lblNewLabel_3.setBounds(24, 124, 66, 15);
		add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(132, 122, 240, 19);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Endereço: ");
		lblNewLabel_4.setBounds(24, 151, 81, 15);
		add(lblNewLabel_4);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(132, 153, 240, 19);
		add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JButton btnSalvarPessoa = new JButton("Enviar");
		btnSalvarPessoa.setBounds(258, 214, 114, 25);
		add(btnSalvarPessoa);
		
		final var pessoa = new Pessoa();
		
		pessoa.setCpf("a");
		pessoa.setNome("a");
		pessoa.setTelefone("a");
		pessoa.setEmail("a");
		pessoa.setEndereco("a");
		
		pessoaRepository.save(pessoa);
		
		btnSalvarPessoa.addActionListener((ActionEvent event) -> {
			pessoa.setCpf(txtCpf.getText());
			pessoa.setNome(txtNome.getText());
			pessoa.setTelefone(txtTelefone.getText());
			pessoa.setEmail(txtEmail.getText());
			pessoa.setEndereco(txtEndereco.getText());
			
			pessoaRepository.save(pessoa);
		});	

	}
}
