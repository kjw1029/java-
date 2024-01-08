import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ImageCards extends JFrame {
	public ImageCards() {
		JPanel pnlImages = new JPanel();
		CardLayout cardLayout = new CardLayout();
		pnlImages.setLayout(cardLayout);

		pnlImages.add(new JLabel(new ImageIcon("춘식1.png")), "1번");
		pnlImages.add(new JLabel(new ImageIcon("춘식2.png")), "2번");
		pnlImages.add(new JLabel(new ImageIcon("춘식3.png")), "3번");

		JButton btnPrev = new JButton("<");
		JButton btnNext = new JButton(">");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				if (command.equals("<")) {
					cardLayout.previous(pnlImages);
				}else if  (command.equals(">")) {
					cardLayout.next(pnlImages);
				}
			}
		};
		
		btnPrev.addActionListener(listener);
		btnNext.addActionListener(listener);
		
		add(btnPrev, "West");
		add(btnNext, "East");
//		Timer timer = new Timer(1000, new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				cardLayout.next(pnlImages);
//			}
//		});

		add(pnlImages);

		showGUI();
	}

	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageCards();
	}

}
