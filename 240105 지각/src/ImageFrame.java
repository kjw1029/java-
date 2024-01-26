import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ImageFrame extends JFrame {
	public ImageFrame() {
		JPanel pnlNorth = new JPanel();
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 5, 1));
		pnlNorth.add(spinner);
		
		add(pnlNorth, "North");
		
		JPanel pnlImages = new JPanel();
		CardLayout cardLayout = new CardLayout();
		pnlImages.setLayout(cardLayout);
		
		pnlImages.add(new JLabel(new ImageIcon("춘식1.png")), "1번");
		pnlImages.add(new JLabel(new ImageIcon("춘식2.png")), "2번");
		pnlImages.add(new JLabel(new ImageIcon("춘식3.png")), "3번");
		
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(pnlImages);
			}
		});
		timer.start();
		
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				timer.setDelay( ((int) spinner.getValue() * 1000) );
			}
		});
		
		add(pnlImages);
		
	
		setSize(500, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


	
//		JButton btnPrev = new JButton("<");
//		JButton btnNext = new JButton(">");
//		
//		ActionListener listener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String command = e.getActionCommand();
//				if (command.equals("<")) {
//					cardLayout.previous(pnlImages);
//				} else if (command.equals(">")) {
//					cardLayout.next(pnlImages);
//				}
//			}
//		};
//		btnPrev.addActionListener(listener);
//		btnNext.addActionListener(listener);
//		
//		add(btnPrev, "West");
//		add(btnNext, "East");
	
	
	
	
	public static void main(String[] args) {
		new ImageFrame();
	}
}







