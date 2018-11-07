import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoBoundary {

	private JFrame janela;
	private JTextField txtNome;
	private JTextField txtRA;

	public AlunoBoundary() {
		janela = new JFrame("Registro de Alunos");
		JPanel painel = new JPanel(new GridLayout(2, 2));
		JLabel lblNome = new JLabel("Nome do Aluno: ");
		JLabel lblRA = new JLabel("RA do Aluno: ");

		txtNome = new JTextField(20);
		txtRA = new JTextField(10);

		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblRA);
		painel.add(txtRA);

		janela.setContentPane(painel);
		janela.setSize(300, 90);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AlunoBoundary();
	}

}
