import java.util.Arrays;

public class TestGugu {

	public static void main(String[] args) {
//	 구구단의 값을 2차원 배열 생성하기
//		8행, 9열의 배열
//		2, 4, 6...
//		3, 6, 9, 12...
		int[][] gugu = new int[8][9];
		
		for (int i = 0; i < gugu.length; i++) {
			for(int j = 0; j< gugu[i].length; j++) {
				gugu[i][j] = (i+2) * (j+1);
				
			}
			
		}
		System.out.println(Arrays.deepToString(gugu));

	}

}
