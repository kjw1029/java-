import java.util.Arrays;

public class Equality {
	public static void main(String[] args) {
		int[] left = {1, 2, 3, 4};
		int[] right = {1, 2, 3, 4};
		
		System.out.println(left == right);
		
		// 길이가 같고
		// 각 인덱스의 원소의 값들이 같은지
		System.out.println(Arrays.equals(left, right));
	}

}
