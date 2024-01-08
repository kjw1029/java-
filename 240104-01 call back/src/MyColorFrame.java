import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 색 변경 버튼 (임의의 색으로 변경된다
public class MyColorFrame extends JFrame implements ActionListener{
	private JPanel pnl;
	private Random ran;
	
	public MyColorFrame() {
		ran = new Random();
		
		pnl = new JPanel();
		pnl.setBackground(new Color(0, 0, 0));

		JButton button = new JButton("버튼입니다.");
		button.addActionListener(this);		
		
		pnl.add(button);
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int r = ran.nextInt(256);
		int g = ran.nextInt(256);
		int b = ran.nextInt(256);
		pnl.setBackground(new Color(r, g, b));
	}
	
	public static void main(String[] args) {
		new MyColorFrame();
	}

	

}
