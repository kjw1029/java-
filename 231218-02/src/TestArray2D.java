
public class TestArray2D {

	public static void main(String[] args) {
		// 3명의 구영수 점수를 표현하고자 함
	//	int[] scores = new int[] {30, 40, 50, 60, 70, 80, 10, 20, 30};
	//	int korSum = scores[0] + scores[3] + scores[6];
		
		int[] stu1 = new int[] {30, 40, 50};
		int[] stu2 = new int[] {60, 70, 80};
		int[] stu3 = new int[] {10, 20, 30};
		
		int korSum = stu1[0] + stu2[0] + stu3[0];
		
		//int[][] arr2d = {stu1, stu2, stu3};
		
		//int[] ref = arr2d[0];
		//System.out.println(ref[0]);
		
		int[][] arr2d = { stu1, stu2, stu3 };
		System.out.println(arr2d[0][0]);
		System.out.println(arr2d[1][0]);
		System.out.println(arr2d[2][0]);
		
		for (int i = 0; i < stu1.length; i++) {
			System.out.println(stu1[i]);
		}
		for (int i = 0; i < stu2.length; i++) {
			System.out.println(stu2[i]);
		}
		for (int i = 0; i < stu3.length; i++) {
			System.out.println(stu3[i]);
		}
		
		for (int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j <arr2d[i].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
	}

}
