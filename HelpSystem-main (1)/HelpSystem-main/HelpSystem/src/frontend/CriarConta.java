package frontend;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import backend.Usuario;
import backend.Cadastro;

public class CriarConta {
	
	public void window() {
		
		TelaLogin telaLogin = new TelaLogin();
//		CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
		
		Usuario usuario = new Usuario();
		Cadastro cadastro = new Cadastro();
		
		
		JFrame jframe = new JFrame("Cadastro");
		
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(1280,720);
		jframe.setBackground(Color.WHITE);
		
		
		
		JPanel top = (JPanel) jframe.getContentPane();
		top.setLayout(new GridLayout(12,1));
		
		
		
		JLabel criar = new JLabel("Criar uma nova conta");
		top.add(criar);
		Dimension size = criar.getPreferredSize();
		criar.setBounds(640, 500, size.width, size.height);
		
		JLabel jaCadastrado = new JLabel("Já possui cadastro? Entre aqui.");
		jaCadastrado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				jframe.setVisible(false);
				telaLogin.window();
				
			}
			
		});
		
		
		
		top.add(jaCadastrado);
		jaCadastrado.setBounds(640, 360, size.width, size.height);		
		
		
		JLabel nome = new JLabel("NOME");
		top.add(nome);
		nome.setBounds(640, 360, size.width, size.height);		
		
		JTextField campoNome = new JTextField();
		top.add(campoNome);
		
		
		JLabel email = new JLabel("EMAIL");
		top.add(email);
		email.setBounds(640, 360, size.width, size.height);
		
		JTextField campoEmail = new JTextField();
		top.add(campoEmail);
		
		
		JLabel senha = new JLabel("SENHA");
		top.add(senha);
		senha.setBounds(640, 360, size.width, size.height);	
		
		JPasswordField campoSenha = new JPasswordField();
		top.add(campoSenha);
		
		
		JLabel setor = new JLabel("SETOR");
		top.add(setor);
		setor.setBounds(640, 360, size.width, size.height);
		
		JComboBox boxSetor = new JComboBox();
		top.add(boxSetor);
		
		
		
		JButton seguinte = new JButton("Seguinte");
		seguinte.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

				
				
				usuario.setNome(campoNome.getText());
				usuario.setEmail(campoEmail.getText());
				usuario.setSenha(String.valueOf(campoSenha.getPassword()));
				
				cadastro.inserir(usuario);
				
				
				JOptionPane.showMessageDialog(seguinte, "Usuario Cadastrado");
				jframe.setVisible(false);
				telaLogin.window();
				
			}
			
		});
		
		
		top.add(seguinte);

		
		
		jframe.setVisible(true);
		
		
	}

}
