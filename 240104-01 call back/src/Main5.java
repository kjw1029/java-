import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main5 extends JFrame implements ActionListener{
	JLabel lbl;
	public Main5() {
		// Container 역할
		JPanel pnl = new JPanel();
		lbl = new JLabel("텍스트");
		JButton button = new JButton("버튼입니다.");

		// Text를 표현
		pnl.add(button);
		pnl.add(lbl);
		add(pnl);
		button.addActionListener(this);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		lbl.setText("글자를 바꿈");
//		System.out.println("이벤트 발생 확인");
	}
	
	public static void main(String[] args) {
		new Main5();
	}

	

}
