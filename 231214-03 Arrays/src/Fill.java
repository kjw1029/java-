import java.util.Arrays;

public class Fill {
	public static void main(String[] args) {
		int[] nums = new int[100];
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.fill(nums, 100);
		System.out.println(Arrays.toString(nums));
	}

}
