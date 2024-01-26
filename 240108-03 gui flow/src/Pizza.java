import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Pizza extends JFrame {
	private int price;
	private JPanel contentPane;

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 153, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 60, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 232, SpringLayout.WEST, contentPane);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, -194, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -48, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -32, SpringLayout.WEST, panel);
		contentPane.add(panel_1);

		JPanel panel_2 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_2, 78, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_2, -154, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_2, -48, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_2, -15, SpringLayout.EAST, contentPane);
		contentPane.add(panel_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("피클500");
		panel_2.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("핫소스100");
		panel_2.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("치츠추가2000");
		panel_2.add(chckbxNewCheckBox_2);

		JPanel panel_3 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_3, -63, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_3, 13, SpringLayout.EAST, panel_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_3, -27, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("페퍼로니(11,000)");
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("치즈 (10,000)");
		panel_1.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("불고기(12,000)");
		panel_1.add(rdbtnNewRadioButton);

		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		contentPane.add(panel_3);

		JLabel lblNewLabel = new JLabel("New label");
		panel_3.add(lblNewLabel);

		ItemListener listener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int price = 0;
				if (rdbtnNewRadioButton_1.isSelected()) {
					price = 10000;
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					price = 11000;
				} else if (rdbtnNewRadioButton.isSelected()) {
					price = 12000;
				}
				price += chckbxNewCheckBox.isSelected() ? 500 : 0;
				price += chckbxNewCheckBox_1.isSelected() ? 2000: 0;
				price += chckbxNewCheckBox_2.isSelected() ? 400 : 0;
				
				lblNewLabel.setText("주메뉴 가격 : " + price);
			}
		};
		rdbtnNewRadioButton_1.addItemListener(listener);
		rdbtnNewRadioButton_2.addItemListener(listener);
		rdbtnNewRadioButton.addItemListener(listener);
		
		chckbxNewCheckBox.addItemListener(listener);
		chckbxNewCheckBox_1.addItemListener(listener);
		chckbxNewCheckBox_2.addItemListener(listener);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton);

		setVisible(true);
	
	
	}

}
