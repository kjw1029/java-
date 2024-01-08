import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainPriceFrame extends JFrame {
	public MainPriceFrame() {
		JRadioButton rdoSuji = new JRadioButton("스지 전골");
		JRadioButton rdoDaechang = new JRadioButton("대창 전골");
		JRadioButton rdoMushroom = new JRadioButton("버섯 전골");
		JLabel lblPrice = new JLabel("");
		
		ItemListener listener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int price = 0;
				if (rdoSuji.isSelected()) {
					price = 30000;
				}
				if (rdoDaechang.isSelected()) {
					price = 31000;
				}
				if (rdoMushroom.isSelected()) {
					price = 32000;
				}
				
				lblPrice.setText("주메뉴 가격 : " + price);
			}
		};
		
		rdoSuji.addItemListener(listener);
		rdoDaechang.addItemListener(listener);
		rdoMushroom.addItemListener(listener);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdoSuji);
		group.add(rdoDaechang);
		group.add(rdoMushroom);
		
		rdoSuji.setSelected(true);
		
		JPanel pnl = new JPanel();
		pnl.add(rdoSuji);
		pnl.add(rdoDaechang);
		pnl.add(rdoMushroom);
		
		pnl.add(lblPrice);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainPriceFrame();
	}
}
