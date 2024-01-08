
// 시작 버튼을 누르면
// 카운트 다운을 시작하는 프로그램
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerTest extends JFrame implements ActionListener {
	private JLabel lbl;
	int i = 10;
	private Timer timer;
	private JButton btn;
	private JPanel pnl;
	
	
	public TimerTest() {
		pnl = new JPanel();
		btn = new JButton("시작");
		lbl = new JLabel();
		btn.addActionListener(this);

		pnl.add(btn);
		pnl.add(lbl);
		add(pnl);
		
		lbl.setText(String.valueOf(i));
		
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				lbl.setText(String.valueOf(i));
				if (i == 0 ) {
					timer.stop();
					btn.setEnabled(true);
				}
			}
		});
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		i = 10;
		lbl.setText(String.valueOf(i));
		timer.start();
		btn.setEnabled(false);
	
//		String commend = e.getActionCommand();
//		if (i == 0) {
//			timer.stop();
//		}else if (commend != null && commend.equals("시작")) {
//			timer.start();
////			i--;
////			lbl.setText(String.valueOf(i));
//		} else {
//			i--;
//			lbl.setText(String.valueOf(i));
//		}
	}

	public static void main(String[] args) {
		new TimerTest();
	}

}
