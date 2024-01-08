import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class Pizza extends JFrame {
	private int price;
	private JPanel contentPane;
	private JLabel lbl;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 144, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 61, SpringLayout.NORTH, getContentPane());
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 25, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -24, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, -5, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -296, SpringLayout.EAST, getContentPane());
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_2);
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 31, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, -154, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -24, SpringLayout.SOUTH, getContentPane());
		
		JRadioButton rdbtnPepperoni = new JRadioButton("페퍼로니피자 (11,000원)");
		panel_1.add(rdbtnPepperoni);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("치즈피자(10,000원)");
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("불고기피자(12,000원)");
		panel_1.add(rdbtnNewRadioButton_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, -66, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 198, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -24, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, -43, SpringLayout.WEST, panel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("피클 추가(500원)");
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("치즈 추가(2000원)");
		panel_2.add(chckbxNewCheckBox_1);
		getContentPane().add(panel_3);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel11 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel11, 70, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel11, 26, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel11, 171, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel11, 214, SpringLayout.WEST, contentPane);
		contentPane.add(panel11);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("페퍼로니 피자(11000원)");
		rdbtnNewRadioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		panel11.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("치즈 피자(10000원)");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		panel11.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("불고기피자(12000원)");
		rdbtnNewRadioButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel11.add(rdbtnNewRadioButton_21);
		
		JPanel panel_11 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_11, 0, SpringLayout.NORTH, panel11);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_11, 35, SpringLayout.EAST, panel11);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_11, -73, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_11, -27, SpringLayout.EAST, contentPane);
		contentPane.add(panel_11);
		
		JCheckBox chckbxNewCheckBox1 = new JCheckBox("피클 추가 500원");
		panel_11.add(chckbxNewCheckBox1);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("치즈 추가(2000원)");
		panel_11.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("핫소스 추가 (100원)");
		panel_11.add(chckbxNewCheckBox_2);
		
		JPanel panel_21 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_21, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_21, 148, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_21, -11, SpringLayout.NORTH, panel11);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_21, 254, SpringLayout.WEST, contentPane);
		contentPane.add(panel_21);
		
		JButton btnNewButton1 = new JButton("취소");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_21.add(btnNewButton1);
		
		JPanel panel_31 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_31, -47, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_31, 153, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_31, -5, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_31, 259, SpringLayout.WEST, contentPane);
		contentPane.add(panel_31);
		
		JLabel lbl = new JLabel();
		panel_31.add(lbl);
		
		ButtonGroup group = new ButtonGroup();
		group.add(btnNewButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		ItemListener listener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (btnNewButton.isSelected()) {
					price = 11000;
				}
				if (rdbtnNewRadioButton_1.isSelected()) {
					price = 10000;
				}
				if (rdbtnNewRadioButton_2.isSelected()) {
					price = 12000;
				}
				lbl.setText("주메뉴 가격 : " + price);
			}
		};
		btnNewButton.addItemListener(listener);
		rdbtnNewRadioButton_1.addItemListener(listener);
		rdbtnNewRadioButton_2.addItemListener(listener);
		

	}
}
