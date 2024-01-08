import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//class TempActionListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("다른 동작을 구현한 리스너입니다.");
//	}
//	
//}

public class MyButtonsFrame extends JFrame implements ActionListener{
	public MyButtonsFrame() {
		JPanel pnl = new JPanel();
		JButton btnFirst = new JButton("첫번째");
		JButton btnSecond = new JButton("두번째");
		
		btnFirst.addActionListener(this);
		btnSecond.addActionListener(this);
		
		pnl.add(btnFirst);
		pnl.add(btnSecond);
		
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("커맨드확인: "+command);
		
		if (command.equals("첫번째")) {
			System.out.println("첫번쨰 버튼을 눌렀을 때 동작 구현");
		} else if (command.equals("두번째")) {
			System.out.println("두번째 버튼을 눌렀을 떄 동작 구현");
		}
	}

	public static void main(String[] args) {
		new MyButtonsFrame();
	}
	
}
