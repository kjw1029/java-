import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageFrame extends JFrame {
	public ImageFrame() {
		// 자원 (resource)
		// 경로
		JLabel lbl = new JLabel(new ImageIcon("images/춘식13.png"));
		JButton btn = new JButton(new ImageIcon("춘식2.png"));
		JLabel lbl2 = new JLabel(new ImageIcon("춘식6.gif"));
		JPanel pnl = new JPanel();
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(lbl2);
		
		add(pnl);
		
		setSize(500, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageFrame();
	}
}







