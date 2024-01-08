import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
	public Test() {
		JPanel pnlLogin = new JPanel();
		pnlLogin.add(new JLabel("로그인"));
		JPanel pnlPizza = new JPanel();
		pnlPizza.add(new JLabel("Pizza"));
		
		JPanel pnlCard = new JPanel();
		CardLayout layout = new CardLayout();
		pnlCard.setLayout(layout);
		
		pnlCard.add(pnlLogin, "로그인");
		pnlCard.add(pnlPizza, "Pizza");
		
		JPanel pnlBotton = new JPanel();
		JButton btnLogin = new JButton("로그인");
//		JButton btnPizza = new JButton("Pizza");
		pnlBotton.add(btnLogin);
//		pnlBotton.add(btnPizza);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(pnlCard, e.getActionCommand());
			}
		};
		btnLogin.addActionListener(listener);
//		btnPizza.addActionListener(listener);
		
		
		add(pnlCard);
		add(pnlBotton, "East");
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}

}
