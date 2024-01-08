import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextComponentsFrame extends JFrame {
	public TextComponentsFrame() {
		JLabel lbl = new JLabel("텍스트 출력");
		JTextField tf = new JTextField(10);
		tf.setText("사용자가 상호작용가능");
		JPasswordField pf = new JPasswordField(10);
		
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("글자가 타이핑 됨");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("눌려진 키가 떼짐");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("사용자가 키를 누름");
			}
		});
		
//		tf.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				System.out.println("텍스트필드가 사용자의 포커를 잃음.");
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				System.out.println("포커스를 얻음");
//			}
//		});
//		
//		tf.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 입력을 끝내고 ENTER 키를 누를떄, 액션 이벤트 발생");
//			}
//		});

		JPanel pnl = new JPanel();
		pnl.add(lbl);
		pnl.add(tf);
		pnl.add(pf);
		add(pnl);
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextComponentsFrame();
	}

}
