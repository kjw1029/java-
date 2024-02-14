import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

/*
 * {
 * 		"winningNum" : [1, 2, 3, 4, 5, 6],
 * 		"bonusNum" : 7
 * }
 * -----------------------------------------------
 * {
 * 		"games" : {
 * 			"game1" : [11, 22, 33, 34, 44, 45],
 * 			"game2" : [4, 5, 6, 10, 11, 12]
 * 		}
 * }
 */
class MyClass {
	private int[] winningNum;
	private int bonusNum;
	public MyClass(int[] winningNum, int bonusNum) {
		super();
		this.winningNum = winningNum;
		this.bonusNum = bonusNum;
	}
	@Override
	public String toString() {
		return "{\n\"winningNum\""+":" + Arrays.toString(winningNum) + ", \n\"bonusNum\"" +" : " + bonusNum + "\n}";
	}
	
	
}
class game {
	private int[] game1;
	private int[] game2;
}
class MyClass2 {
	private List<int[]> game;
	
	public MyClass2(List<int[]> game) {
		super();
		this.game = game;
	}
	@Override
	public String toString() {
		return "MyClass2 [game=" + game + "]";
	}
	
}
public class Main {
	public static void main(String[] args) {
		Gson gson = new Gson();
		game game = new game();
		int[] game2 = {4,5,6,10,11,12};
//		List<int[]> list = new ArrayList<>(Arrays.asList(game1, game2));
		String text = "{\"winningNum\" : [ 1, 2, 3, 4, 5, 6],\"bonusNum\" : 7}";
		
		MyClass m = gson.fromJson(text, MyClass.class);
		System.out.println(m);
		
		String textgame = "{"+"\n" + "{\"game\" : game1 : [11,22,33,34,44,45]," +"\n" + "\"game2\" : [4,5,6,10,11,12] }" + "\n" +"}";
		System.out.println(textgame);
		
	}

}
