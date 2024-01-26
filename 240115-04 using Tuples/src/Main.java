import org.javatuples.Pair;

public class Main {
	public static void main(String[] args) {
		// 튜플, 트리플...
		Pair<String, Integer> pair = Pair.with("hello", Integer.valueOf(23));
		
		System.out.println(pair.getValue0());
		System.out.println(pair.getValue1());
	}

}
