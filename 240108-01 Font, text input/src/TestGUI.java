import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TestGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI frame = new TestGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		sl_panel.putConstraint(SpringLayout.NORTH, passwordField, 19, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, passwordField, 114, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textField);
		panel.add(passwordField);

		JButton btnNewButton = new JButton("로그인");
		sl_panel.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, btnNewButton);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 52, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -138, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel.putConstraint(SpringLayout.EAST, textField, -35, SpringLayout.WEST, btnNewButton);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, -159, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -62, SpringLayout.EAST, panel);
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("아이디");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -26, SpringLayout.WEST, textField);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, passwordField);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		panel.add(lblNewLabel_1);
		
		ActionListener l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("admin") && passwordField.getText().equals("1234")) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
			}
		};
		
		textField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		passwordField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
			// deprecated - 해당 메소드는 더 이상 사용을 권장하지 않음.
			@Override
			public void keyPressed(KeyEvent e) {
				if (textField.getText().equals("admin") && passwordField.getText().equals("1234")) {
					System.out.println("로그인 성공");
				}
			}
		});
		btnNewButton.addActionListener(l);
	}
}
