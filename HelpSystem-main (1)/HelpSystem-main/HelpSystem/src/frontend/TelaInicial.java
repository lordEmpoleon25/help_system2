package frontend;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaInicial {
	
	public void window() {
		
//		BuscarPergunta buscarPergunta = new BuscarPergunta();
		CriarPergunta criarPergunta = new CriarPergunta();
		CriarResposta criarResposta = new CriarResposta();
		
		
		JFrame jframe = new JFrame("Busca de Perguntas");
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(1280,720);
		jframe.setBackground(Color.WHITE);
		
		JPanel all = (JPanel) jframe.getContentPane();
		all.setLayout(new GridLayout(3,1));
		
		
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1,1));
		
		
		JLabel nomeUsuario = new JLabel("Usuário");
		top.add(nomeUsuario);
		
		all.add(top);
		
		
		JPanel middle = new JPanel();
		middle.setLayout(new GridLayout(1,4));
		
		
		JLabel id = new JLabel("ID");
		middle.add(id);
		
		JLabel pergunta = new JLabel("Pergunta");
		middle.add(pergunta);
		
		JLabel resposta = new JLabel("Resposta");
		middle.add(resposta);
		
		JLabel usuario = new JLabel("Usuário");
		middle.add(usuario);
		
		all.add(middle);
		
		
		
		JPanel botton = new JPanel();
		botton.setLayout(new GridLayout(1,2));
		
		
		JButton buscar = new JButton("Escrever resposta");		
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jframe.setVisible(false);
				criarResposta.window();
				
			}
			
		});
		
		botton.add(buscar);
		
		
		JButton criar = new JButton("Fazer Pergunta");		
		criar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jframe.setVisible(false);
				criarPergunta.window();
				
			}
			
		});
		
		botton.add(criar);
		
		
		all.add(botton);
		
		
		jframe.setVisible(true);
		
		
	}
	

}
