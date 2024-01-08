import javax.swing.JOptionPane;

public class GuiInputOutputImpl implements ConsoleINputOutput {

	@Override
	public int inputRadius() {
		String input = JOptionPane.showInputDialog("반지름을 입력하세요.");
		int radius = Integer.valueOf(input);
		return radius;
	}

	@Override
	public void printArea(double area) {
		JOptionPane.showConfirmDialog(null, String.format("원 넓이는 %f", area));
	}

}
