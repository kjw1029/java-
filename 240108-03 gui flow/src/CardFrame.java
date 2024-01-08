import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardFrame extends JFrame{
	public CardFrame() {
		JPanel pnlBusan = new JPanel();
		pnlBusan.add(new JLabel("부산 날씨입니다."));
		JPanel pnlUlsan = new JPanel();
		pnlUlsan.add(new JLabel("울산 날씨입니다."));
		
		JPanel pnlCard = new JPanel();
		CardLayout layout = new CardLayout();
		pnlCard.setLayout(layout);
		
		pnlCard.add(pnlBusan, "부산날씨");
		pnlCard.add(pnlUlsan, "울산날씨");
		
		JPanel pnlBotton = new JPanel();
		JButton btnBusan = new JButton("부산날씨");
		JButton btnULsan = new JButton("울산날씨");
		pnlBotton.add(btnBusan);
		pnlBotton.add(btnULsan);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(pnlCard, e.getActionCommand());
			}
		};
		btnBusan.addActionListener(listener);
		btnULsan.addActionListener(listener);
		
		
		add(pnlCard);
		add(pnlBotton, "South");
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CardFrame();
	}

}
