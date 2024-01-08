
public class ProgramImpl implements Program {
	private ConsoleINputOutput io;
	private CircleCalculator cal;
	
	public ProgramImpl() {
		io = new GuiInputOutputImpl();
		cal = new CircleCalculatorImpl();
	}
	
	@Override
	public void run() {
		int radius = io.inputRadius();
		double area = cal.calculateArea(radius);
		io.printArea(area);
	}

}
