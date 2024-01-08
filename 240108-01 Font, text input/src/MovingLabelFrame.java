import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class MovingLabelFrame extends JFrame {
	public MovingLabelFrame() {
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		pnl.setFocusable(true);
		JLabel lbl = new JLabel("ㅁ");
		lbl.setBounds(100, 100, 100, 100);
		pnl.add(lbl);
		
		pnl.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int x = lbl.getX();
				int y = lbl.getY();
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					System.out.println("방향키 위를 누름");
					
					y -= 10;
					
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					y +=10;
				}
				lbl.setLocation(x, y);
			}
		});
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
}

	public static void main(String[] args) {
		new MovingLabelFrame();
	}

}
