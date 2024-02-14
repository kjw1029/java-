import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String lyrics = "I'm super shy, super shy\r\n" +
				"But wait a minute while I make you mine, make you mine\r\n"+
				"떨리는 지금도 you're on my mind all the time\r\n"+
				"I wanna tell you but I'm super shy, super shy\r\n";
		
		// 위의 가사에서 여러 번 등장하는 단어를  찾기
		String replaced = lyrics.replace("\r\n", " ").replace(",", "");
		Set<String> setDistinct = new HashSet<>();
		Set<String> setDuplicate =new HashSet<>();
		
		StringTokenizer tokenizer = new StringTokenizer(replaced, " ");
		while (tokenizer.hasMoreElements()) {
			String word = tokenizer.nextToken();
			if (!setDistinct.add(word)) {
				setDuplicate.add(word);
			}
		}
		System.out.println(setDuplicate);
	}

}
