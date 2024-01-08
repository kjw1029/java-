
public class TestArray2D2 {

	public static void main(String[] args) {
		//int[][] arr2d = new int[4][5];
		int[][] arr2d = new int[][] {
						{1,2,3}
					   ,{4}
					   ,{7,8,9}
					   
		};
		
		for (int i = 0; i <arr2d.length; i++) {
			for (int j = 0; j <arr2d[i].length; j++) {
				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}

	}

}
