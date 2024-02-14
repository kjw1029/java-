import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Moving extends JFrame {
	private int x;
	private int y;
	public Moving() {
		Random ran = new Random();
		JPanel pnl = new JPanel();
		JButton btn = new JButton("Click me");
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				x = ran.nextInt(400);
				y = ran.nextInt(400);
				btn.setLocation(x, y);
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Test2 {
	public static void main(String[] args) {
		new Moving();
	}

}
