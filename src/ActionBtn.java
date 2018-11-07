

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class ActionBtn {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Janela Teste Botão");
		JPanel painel = new JPanel();
		JLabel lblClicar = new JLabel("Clique no botão abaixo");
		JButton btnEnviar = new JButton("Clique Aqui!");
		
		painel.add(lblClicar);
		painel.add(btnEnviar);
		janela.setContentPane(painel);
		
		lblClicar.setBounds(10, 30, 300, 40);
		btnEnviar.setBounds(10, 100, 100, 40);
		
		painel.setLayout(null);
		
		//Instancia do assinante vinculando no Botao
		Acao ac = new Acao();
		btnEnviar.addActionListener(ac);
		
		btnEnviar.setBorder(new LineBorder(Color.black));
		btnEnviar.setBackground(Color.white);
		btnEnviar.setForeground(Color.black);
		
		lblClicar.setFont(new Font("Comic Sans", Font.PLAIN, 16));
		
		janela.setSize(250, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
