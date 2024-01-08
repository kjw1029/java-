import javax.swing.JOptionPane;

public class MyProgram {
	public void showResult(String result, MyOutput myoutput) {// call back
		myoutput.showResult(result);
	}
	
	public static void main(String[] args) {
		MyProgram program = new MyProgram();
		
		program.showResult("문자열 결과", new MyOutput() {
			@Override
			public void showResult(String result) {
				System.out.println("콘솔 출력으로 결과를 보여줍니다.");
				System.out.println(result);
			}
		});
		
		program.showResult("그때그때마다 달라요", new MyOutput() {
			@Override
			public void showResult(String result) {
				JOptionPane.showMessageDialog(null, result);
			}
		});
		
		program.showResult("별표가포함된 결과", new MyOutput() {
			@Override
			public void showResult(String result) {
				System.out.println("******" + result + "*****");
			}
		});
	}

}
