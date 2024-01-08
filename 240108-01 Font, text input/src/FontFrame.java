import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontFrame extends JFrame {
	public FontFrame() {
//		Font myFont = new Font("궁서체", Font.BOLD , 20);
		
		
		Font myFont = null;
		
		try {
			myFont = Font.createFont(Font.TRUETYPE_FONT, 
					FontFrame.class.getClassLoader().getResourceAsStream("font/NanumPenScript-Regular.ttf")
							);
			myFont = myFont.deriveFont(Font.PLAIN,20);
		}catch ( FontFormatException e) {
			e.printStackTrace();
		}catch ( IOException e) {
			e.printStackTrace();
		}
		
		
		
		JLabel lbl = new JLabel("텍스트입니다.");
		lbl.setFont(getFont());
		
		add(lbl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FontFrame();
	}

}
