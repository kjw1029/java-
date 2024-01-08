import java.util.Arrays;

public class TestIntArrayOrder {

	public static void main(String[] args) {
		// 학생들의 점수를 기록한 정수 배열
		int[] scores = { 10, 30, 20, 90, 70 };
		int[] sorted = Arrays.copyOf(scores, 5);

		Arrays.sort(sorted);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sorted));
		
		// 정렬되어 있어야함
		int index = Arrays.binarySearch(sorted, 70);
		System.out.println(index);
//		// 최대 점수
//		int max = 0;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] > max) {
//				max = scores[i];
//			}
//		}
//		System.out.println(max);
//		// 최소 점수
//		int min = 100;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] < min) {
//				min = scores[i];
//			}
//		}
//		
//		// 중위 점수
//		
	}

}
