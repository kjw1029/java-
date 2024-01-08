import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerFrame extends JFrame {
	public SpinnerFrame() {
		JPanel pnl = new JPanel();
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 5);
		JSpinner spinner = new JSpinner(model);
		
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinner.getValue());
			}
		});
		
		pnl.add(spinner);
		add(pnl);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SpinnerFrame();
	}

}
