
////find the  minimum value 
package arrayprograms;

public class searchMinValue {

	public static void main(String[] args) {
		int arr[]= {12,3,9,19,8,9,4};
		int min=arr[1];
		minvalue(arr, min, arr.length);
		

	}
	public static void minvalue(int[] arr,int min,int ed) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
