import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabFrame extends JFrame{
	public TabFrame() {
		JPanel firstTab = new JPanel();
		firstTab.setBackground(Color.RED);
		
		firstTab.add(new JButton("버튼버튼"));
		firstTab.add(new JButton("버튼버튼"));
		firstTab.add(new JButton("버튼버튼"));
		
		JPanel secondTab = new JPanel();
		secondTab.setBackground(Color.GREEN);
		
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab("빨강 화면", firstTab);
		tabPane.addTab("초록 화면", secondTab);
		
		add(tabPane);
	
		showGUI();
	}
	
		private void showGUI() {
			setSize(500, 500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
	public static void main(String[] args) {
		new TabFrame();
	}

}
