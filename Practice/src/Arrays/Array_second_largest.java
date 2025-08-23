package Arrays;

public class Array_second_largest {

	public static void main(String[] args) {
	int arr[]= {-10,13,30,38,40};


	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	int min =arr[0];
	int max =arr[0];
	
	
	 for (int i=1; i<arr.length; i++) {
	 if ( arr[i-1]>max) {
		 max=arr[i-1];
	 }
		 if (arr[i] <min) {
			 min=arr[i];
		 }
	 }

	 System.out.println("the elements max: "+max);

	
}
}