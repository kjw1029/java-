
public class sort {
	static void insertionSort(int[] arr)
	{

	   for(int index = 1 ; index < arr.length ; index++){

	      int temp = arr[index];
	      int aux = index - 1;

	      while( (aux >= 0) && ( arr[aux] > temp ) ) {

	         arr[aux + 1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}
	public static void main(String[] args) {
		sort ad = new sort();
		int[] nums = {50, 60 , 70 ,15 ,14, 13, 45 };
		sort.insertionSort(nums);
		
	
		System.out.println();
	}
}
