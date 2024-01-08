import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class FormattedTFFrame extends JFrame{
	public FormattedTFFrame() {
		JPanel pnl = new JPanel();
		MaskFormatter mask =null;
		try {
			 mask = new MaskFormatter("010-####-####");
			 mask.setPlaceholderCharacter('_');
			 mask.setAllowsInvalid(false);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JFormattedTextField ftf = new JFormattedTextField(mask); // 스윙에서만 사용
		ftf.setColumns(20);
		
		pnl.add(ftf);
		add(pnl);
	
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FormattedTFFrame();
	}

}
