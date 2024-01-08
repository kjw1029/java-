import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 클릭을 했습니다.");
	}
	
}
public class Main3 extends JFrame{
	public Main3() {
		setTitle("제목");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton button = new JButton("버튼입니다.");
		button.addActionListener(new MyActionListener());
		
		add(button);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main3();
		
	}

}
