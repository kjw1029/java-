import java.util.Arrays;

public class ArrPerson {
	public static void bubbleSort(Person[] arr) {
	    
		Person temp = null;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j= 1 ; j < arr.length-i; j++) {
				if(arr[j].getHeight() < arr[j-1].getHeight()) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Person[] arr = new Person[]
				{
						new Person(190, 100)
						, new Person(170, 60)
						, new Person(180, 80)
						, new Person(170, 55)
						
				};
		bubbleSort(arr);
		
		for (Person p : arr) {
			System.out.println(p.getHeight());
			System.out.println(p.getWeight());
					}

	}

}
