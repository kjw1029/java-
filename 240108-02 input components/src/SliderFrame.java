import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {
	public SliderFrame() {
		JPanel pnl = new JPanel();
		JSlider slider = new JSlider(0, 100);
		
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		
		slider.setPaintLabels(true);
		
		JTextField tf = new JTextField(3);
		tf.setEditable(false);
		tf.setText("50");
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				tf.setText(String.valueOf(slider.getValue()));
			}
		});
		
		pnl.add(slider);
		pnl.add(tf);
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderFrame();
	}

}
