package frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import backend.Cadastro;
import backend.Usuario;

public class TelaLogin {
	
	String login;
	String senha;
	
	public void window() {
	
		TelaInicial telaInicial = new TelaInicial();
		Cadastro cadastro = new Cadastro();
		Usuario usuario  = new Usuario();
	
		JFrame jframe = new JFrame("Login");
	
	
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(1280,720);
		jframe.setBackground(Color.WHITE);
		
		
		
		JPanel top = (JPanel) jframe.getContentPane();
		top.setLayout(new GridLayout(6,1));
		
		
		
		JLabel email = new JLabel("EMAIL");
		top.add(email);
		
		
		JTextField campoEmail = new JTextField();
		top.add(campoEmail);
		
		
		JLabel senha = new JLabel("SENHA");
		top.add(senha);
				
		
		JPasswordField campoSenha = new JPasswordField();
		top.add(campoSenha);
		
		
		JButton entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				jframe.setVisible(false);
						
				
				telaInicial.window();
				
			}
			
		});
				
		top.add(entrar);
		
		
		JLabel esqueceuSenha = new JLabel("Esqueci minha senha");
		top.add(esqueceuSenha);

		
		
		jframe.setVisible(true);
		
		
	}

}
