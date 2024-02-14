import java.util.HashMap;
import java.util.Map;

interface DoWork {
	void printWork();
}

public class Main11 {
	public static void main(String[] args) {
		Map<String, DoWork> task = new HashMap<>();
		task.put("첫번째작업", new DoWork() {
			@Override
			public void printWork() {
				System.out.println("밥 먹기");
			}
		});
		
		task.put("두번째작업", new DoWork() {
			@Override
			public void printWork() {
				System.out.println("양치하기");
			}
		});
		
		task.get("첫번째작업").printWork();
		task.get("두번째작업").printWork();
	}

}
