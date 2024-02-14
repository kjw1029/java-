import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Fake extends JFrame {
	private JTextField[] tf;
	
	public Fake() {
		tf = new JTextField[2];
		JPanel pnl = new JPanel();
		
		String[] lables = { "ID", "비밀번호"};
		int index = 0;
		for (String str : lables) {
			JPanel pnlInput = new JPanel();
			JLabel lblText = new JLabel(str);
			JTextField tfInput = new JTextField(15);
			tf[index] = tfInput;
			index++;

			pnlInput.add(lblText);
			pnlInput.add(tfInput);

			pnl.add(pnlInput);
		}
		
		CardLayout card = new CardLayout();
		
		JButton btnbase = new JButton();
		JButton btn = new JButton("확인");
		JButton btnfake = new JButton("속았지");

		btnbase.setLayout(card);
		btnbase.add(btn, "기본");
		btnbase.add(btnfake, "속임");
		
		pnl.add(btnbase);
		
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				card.show(btnbase, "속임");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				card.show(btnbase, "기본");
			}
		});
		add(pnl);
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Test1 {

	public static void main(String[] args) {
		new Fake();
	}

}
