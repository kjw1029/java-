import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class InputDialog extends JDialog {
	private JTextField tfName;
	private JTextField tfPhone;
	private JCheckBox chkAgree;
	private boolean confirmed;
	
	public InputDialog(PollGUI parent) {
		super(parent);
		
		setModal(true);
		
		JLabel lblName = new JLabel("설문자 이름");
		tfName = new JTextField(10);
		JLabel lblPhone = new JLabel("설문자 전화번호");
		tfPhone = new JTextField(10);
		JLabel lblAgree = new JLabel("찬성/반대");
		chkAgree = new JCheckBox("찬성");
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(lblName);
		pnlCenter.add(tfName);
		pnlCenter.add(lblPhone);
		pnlCenter.add(tfPhone);
		pnlCenter.add(lblAgree);
		pnlCenter.add(chkAgree);
		
		add(pnlCenter);
		
		JButton btnConfirm = new JButton("입력 완료");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmed = true;
				dispose();
			}
		});
		add(btnConfirm, "East");
		
		setSize(400, 400);
		setLocationRelativeTo(parent);
	}
	
	private Survey checkInput(Survey s) {
		String name = s.getName().trim();
		String phone = s.getPhoneNumber().trim();
		if (name == null || name.length() < 1 || name.length()>10) {
			return null;
		}
		if (phone == null || phone.isEmpty()) {
			return null;
		}
		return s;
	}
	
	public Survey showDialog() {
		setVisible(true);
		if (confirmed) {
			String name = tfName.getText();
			String phone = tfPhone.getText();
			boolean agree = chkAgree.isSelected();
			
			Survey s =  new Survey(name, phone, agree);
			return checkInput(s);
		}
		return null;
	}
}

public class PollGUI extends JFrame {
	private Poll poll;
	private JLabel lblAgree;
	private JLabel lblDisagree;
	
	public PollGUI() {
		poll = new Poll();
		JPanel pnlCenter = new JPanel();
		JButton btnAdd = new JButton("기록하기");
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InputDialog dialog = new InputDialog(PollGUI.this);
				Survey s = dialog.showDialog();
				
				if (s == null) {
					return;
				}
				
				if (poll.add(s)) {
					int agree = poll.countAgree();
					int disagree = poll.getSize() - agree;
					
					lblAgree.setText("찬성 수 : " + agree );
					lblDisagree.setText("반대 수 : "+ disagree);
					
				}else {
					JOptionPane.showMessageDialog(PollGUI.this, "이미 설문에 참여했습니다.");
				}
			}
		});
		
		pnlCenter.add(btnAdd);
		
		JPanel pnlCount = new JPanel();
		lblAgree = new JLabel("찬성 수 : " + 0);
		lblDisagree = new JLabel("반대 수 : " + 0);
		pnlCount.add(lblAgree);
		pnlCount.add(lblDisagree);
		
		add(pnlCount, "South");
		
		add(pnlCenter);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PollGUI();
	}
}
