package frontend;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BuscarPergunta {
	
	public void window() {
	
		JFrame jframe = new JFrame("Busca de Perguntas");
		
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(1280,720);
		jframe.setBackground(Color.WHITE);
		
		
		JPanel all = (JPanel) jframe.getContentPane();
		GridLayout allLayout = new GridLayout(3,1);
		all.setLayout(allLayout);
		
		
		JPanel top = new JPanel();
		GridLayout topLayout = new GridLayout(3,1);
		top.setLayout(topLayout);
		
		JLabel solicitacoes = new JLabel("TODAS AS SOLICITAÇÕES");
		top.add(solicitacoes);
		
		JLabel busque = new JLabel("Busque perguntas, encontre soluções");
		top.add(busque);
		
		JLabel filtrar = new JLabel("FILTRAR POR:");
		top.add(filtrar);
		
		all.add(top);
		
		
		JPanel middle = new JPanel();
		GridLayout middleLayout = new GridLayout(2,3);
		middle.setLayout(middleLayout);
		
		
		JLabel setor = new JLabel("SETOR");
		middle.add(setor);
		
		JLabel status = new JLabel("STATUS");
		middle.add(status);
		
		JLabel colaborador = new JLabel("COLABORADOR");
		middle.add(colaborador);
		
		
		JComboBox boxSetor = new JComboBox();
		middle.add(boxSetor);
		
		JComboBox boxStatus = new JComboBox();
		middle.add(boxStatus);
		
		JComboBox boxColaborador = new JComboBox();
		middle.add(boxColaborador);
		
		all.add(middle);
		
		
		JPanel botton = new JPanel();
		GridLayout bottonLayout = new GridLayout(1,1);
		botton.setLayout(middleLayout);
		
		
		JButton buscar = new JButton("BUSCAR");
		botton.add(buscar);
		
		
		all.add(botton);
		
		
		jframe.setVisible(true);
		
	
	}

}
