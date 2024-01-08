import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame{
	public TextAreaFrame() {
		JTextField tf = new JTextField();
		tf.setText("기본텍스트");
//		tf.setEnabled(false);
		
		JTextArea ta = new JTextArea();
		ta.setText("기본텍스트");
		ta.setEditable(false);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				ta.append(input + "\n");
				tf.selectAll();
			}
		});
		
		JScrollPane scroll = new JScrollPane(ta);
		
		add(tf,"North");
		add(scroll);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaFrame();
	}

}
