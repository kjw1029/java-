// 2.
// *****
// ****
// ***
// **
// *

public class Test02 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for(int a = 0; a <5; a++) {
				if (i==a) {
				    for (int j = 0 ; j <5; j++){
					    if (j>=i) {
					    System.out.print("*");
					    }
				    }
			    } 
			}
			System.out.println();
		}
	}
}