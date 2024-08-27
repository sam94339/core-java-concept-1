
public class Array {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		
		arr1[0] = 1;
		arr1[1] = 3;
		arr1[2] = 3;
		arr1[3] = 89;
		arr1[4] = 9;
		
		int[] arr2 = {1, 3, 5, 7, 8, 6};
		
		for(int i = 0; i<arr1.length; i++) {
			
			System.out.println(arr1[i]);
			
		}
		
		System.out.println("Second Array");
		
		for(int i = 0; i<arr2.length; i++) {
			
			System.out.println(arr2[i]);
		}

	}

}
