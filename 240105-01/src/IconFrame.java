import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;

public class IconFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IconFrame frame = new IconFrame();
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
	public IconFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		panel.setPreferredSize(new Dimension(10, 70));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(IconFrame.class.getResource("/images/kitchenware_equipment_decor_set_room_interior_kitchen_fork_spoon_icon_260151.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 이벤트 확인");
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("발생");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(IconFrame.class.getResource("/images/chef_hat_icon_260176.png")));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton btnNewButton_2 = new JButton("");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_2, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, panel_1);
		btnNewButton_2.setIcon(new ImageIcon(IconFrame.class.getResource("/images/kitchenware_equipment_decor_set_room_interior_kitchen_oven_icon_260136.png")));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, btnNewButton_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_3, -10, SpringLayout.SOUTH, panel_1);
		btnNewButton_3.setIcon(new ImageIcon(IconFrame.class.getResource("/images/kitchenware_equipment_decor_set_room_interior_kitchen_pan_icon_260133.png")));
		panel_1.add(btnNewButton_3);
	}
}
