import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNum {
	public static void main(String[] args) {
		// 1 ~ 10사이의 무작위 정수를 4개 자기는집합(중복x) 생성하기
		Set<Integer> set = new HashSet<>();

		Random random = new Random();

		while (set.size() < 4) {
			set.add(random.nextInt(10) + 1);
		}
		System.out.println(set);
	}

}
